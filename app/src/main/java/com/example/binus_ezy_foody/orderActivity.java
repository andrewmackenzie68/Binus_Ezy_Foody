package com.example.binus_ezy_foody;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.binus_ezy_foody.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class orderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       DBHelper helper = new DBHelper(this);
       ArrayList<OrdersModel>
               list = helper.getOrders();

        com.example.binus_ezy_foody.ordersAdapter adapter = new com.example.binus_ezy_foody.ordersAdapter(list, this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);
    }
}