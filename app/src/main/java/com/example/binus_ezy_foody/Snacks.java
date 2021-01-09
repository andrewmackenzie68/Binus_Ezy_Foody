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

public class Snacks extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);

        ArrayList<SnacksModel> list= new ArrayList<>();
        list.add(new SnacksModel(R.drawable.chitato,"Chitato","8000"));
        list.add(new SnacksModel(R.drawable.frenchfries2000,"Frendh Fries 2000","7000"));
        list.add(new SnacksModel(R.drawable.kusuka,"Kusuka","10000"));
        list.add(new SnacksModel(R.drawable.lays,"Lays","9000"));
        com.example.binus_ezy_foody.SnacksAdapter adapter = new com.example.binus_ezy_foody.SnacksAdapter(list,this);
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
                startActivity(new Intent(com.example.binus_ezy_foody.Snacks.this , com.example.binus_ezy_foody.orderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}