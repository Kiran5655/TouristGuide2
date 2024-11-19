package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class dosa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosa);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load("https://static.toiimg.com/thumb/63841432.cms?width=1200&height=900").placeholder(R.drawable.appbg).into(id1);

    }
}