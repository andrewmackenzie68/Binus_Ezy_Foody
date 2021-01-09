package com.example.binus_ezy_foody;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import java.util.ArrayList;

public class Foods extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);

        ArrayList<FoodsModel> list= new ArrayList<>();
        list.add(new FoodsModel(R.drawable.nasigoreng,"Nasi Goreng","25000"));
        list.add(new FoodsModel(R.drawable.miegoreng,"Mie Goreng","25000"));
        list.add(new FoodsModel(R.drawable.ayamgoreng,"Ayam Goreng","15000"));
        list.add(new FoodsModel(R.drawable.sate,"Sate","25000"));
        com.example.binus_ezy_foody.FoodsAdapter adapter = new com.example.binus_ezy_foody.FoodsAdapter(list,this);
        mRecyclerView = findViewById(R.id.recyclerView);

        mRecyclerView.setAdapter(adapter);

        mLayoutManager = new GridLayoutManager(this,2);
        mRecyclerView.setLayoutManager(mLayoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.orders:
                startActivity(new Intent(com.example.binus_ezy_foody.Foods.this , com.example.binus_ezy_foody.orderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}