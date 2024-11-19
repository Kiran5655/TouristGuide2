package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ARISELU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ariselu);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load("https://martmines.com/wp-content/uploads/2021/06/Plain-Ariselu-3.jpg").placeholder(R.drawable.appbg).into(id1);

    }
}