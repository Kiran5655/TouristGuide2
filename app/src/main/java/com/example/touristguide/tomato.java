package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class tomato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load("https://www.southernplate.com/wp-content/uploads/2014/04/Tomato-chips.jpg").placeholder(R.drawable.appbg).into(id1);

    }
}