package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class roti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roti);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load("https://www.vegrecipesofindia.com/wp-content/uploads/2021/04/methi-paratha-4-500x500.jpg").placeholder(R.drawable.appbg).into(id1);

    }
}