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

public class Drinks extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        ArrayList<DrinksModel> list= new ArrayList<>();
        list.add(new DrinksModel(R.drawable.aqua,"Mineral Water","5000"));
        list.add(new DrinksModel(R.drawable.apple,"Apple Juice","15000"));
        list.add(new DrinksModel(R.drawable.alpukat,"Avocado Juice","15000"));
        list.add(new DrinksModel(R.drawable.mangga,"Mango Juice","15000"));
        com.example.binus_ezy_foody.DrinksAdapter adapter = new com.example.binus_ezy_foody.DrinksAdapter(list,this);
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
                startActivity(new Intent(com.example.binus_ezy_foody.Drinks.this , com.example.binus_ezy_foody.orderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}