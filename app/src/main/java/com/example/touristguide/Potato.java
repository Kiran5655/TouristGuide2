package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Potato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load("https://static.onecms.io/wp-content/uploads/sites/19/2008/05/14/eggs-on-potato-chips-su.jpg").placeholder(R.drawable.appbg).into(id1);

    }
}