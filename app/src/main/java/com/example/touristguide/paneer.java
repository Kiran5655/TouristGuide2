package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class paneer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paneer);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load("https://images.news18.com/ibnkhabar/uploads/2020/10/shahi-paneer.jpg").placeholder(R.drawable.appbg).into(id1);

    }
}