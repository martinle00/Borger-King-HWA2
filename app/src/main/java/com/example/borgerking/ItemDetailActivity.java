package com.example.borgerking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Math;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;

public class ItemDetailActivity extends AppCompatActivity {
        private TextView foodTextView;
        private ImageView imageView;
        private TextView priceTextView;
        private TextView descTextView;
        private TextView quantityTextView;
        private Button addToOrder;
        private Button plusQuantity;
        private Button minusQuantity;
        int counter = 0;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_item_detail);

            Intent intent = getIntent();
            int foodID = intent.getIntExtra("itemID", 0);

            final Items item = ItemDatabase.getItemsByID(foodID);

            foodTextView = findViewById(R.id.foodName);
            imageView = findViewById(R.id.foodImage);
            priceTextView = findViewById(R.id.foodPrice);
            descTextView = findViewById(R.id.foodDescription);
            quantityTextView = findViewById(R.id.foodQuantity);
            addToOrder = findViewById(R.id.orderButton);
            plusQuantity = findViewById(R.id.foodQuantityPlus);
            minusQuantity = findViewById(R.id.foodQuantityMinus);

            foodTextView.setText(item.getName());
            imageView.setImageResource(item.getImageDrawableID());
            descTextView.setText(item.getDescription());




        }
    public void onMinusClick(View view){
        if (counter < 0){
            Toast.makeText(getApplicationContext(),"Can't order less than 0 items!",Toast.LENGTH_SHORT).show();
        }
        counter--;
        quantityTextView.setText(Integer.toString(counter));
        priceTextView.setText("$"+Double.toString(counter * 2) + "0");
    }
    public void onPlusClick(View view){
        counter++;
        quantityTextView.setText(Integer.toString(counter));
        priceTextView.setText("$"+Double.toString(counter *  2) + "0");
    }









}
