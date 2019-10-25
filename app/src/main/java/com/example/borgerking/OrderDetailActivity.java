package com.example.borgerking;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderDetailActivity extends AppCompatActivity {
    private TextView foodTextView;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_detail);

        Intent intent = getIntent();
        int foodID = intent.getIntExtra("itemID", 0);

        Items item = ItemDatabase.getItemsByID(foodID);

        foodTextView = findViewById(R.id.foodName);
        imageView = findViewById(R.id.foodImage);

        foodTextView.setText(item.getName());
        imageView.setImageResource(item.getImageDrawableID());
    }
}
