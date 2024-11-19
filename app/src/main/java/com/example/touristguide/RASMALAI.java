package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class RASMALAI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rasmalai);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load(" https://www.indianhealthyrecipes.com/wp-content/uploads/2021/10/rasmalai-recipe.jpg").placeholder(R.drawable.appbg).into(id1);

    }
}