package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class idly extends AppCompatActivity {
    ImageView id1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idly);
        id1=findViewById(R.id.bi1);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNJbY56VXMAkF0U5cXzjKAE01IrNq1KiToTg&usqp=CAU").placeholder(R.drawable.appbg).into(id1);
    }
}