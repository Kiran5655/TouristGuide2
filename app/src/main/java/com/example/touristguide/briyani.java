package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class briyani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_briyani);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load("https://veenaazmanov.com/wp-content/uploads/2017/03/Hyderabad-Chicken-Biryani-Dum-Biryani-Kachi-Biryani4.jpg").placeholder(R.drawable.appbg).into(id1);

    }
}