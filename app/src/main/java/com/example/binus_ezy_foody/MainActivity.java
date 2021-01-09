package com.example.binus_ezy_foody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button drinksbtn,myorderbtn,foodsbtn,snacksbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinksbtn = findViewById(R.id.drinksbtn);
        myorderbtn = findViewById(R.id.MyOrderBtn);
        foodsbtn = findViewById(R.id.foodsbtn);
        snacksbtn = findViewById(R.id.snacksbtn);

        drinksbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Drinks.class);
                startActivity(intent1);
            }
        });

        myorderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, orderActivity.class);
                startActivity(intent2);            }
        });

        foodsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, Foods.class);
                startActivity(intent3);
            }
        });

        snacksbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, Snacks.class);
                startActivity(intent4);
            }
        });
    }

}