package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class gulab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulab);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load("https://butteroverbae.com/wp-content/uploads/2021/12/gulab-jamun-with-milk-powder-final.jpg").placeholder(R.drawable.appbg).into(id1);

    }
}