package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class bhel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhel);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load("https://1.bp.blogspot.com/-5rrpZp-6Q8Y/Xs7VtkpuVOI/AAAAAAAAKEo/q-_IRK84kRwdAPkLmdWs0E8VhhRsQqAbQCLcBGAsYHQ/s1600/Bhel%2BPuri%2BRecipe.JPG").placeholder(R.drawable.appbg).into(id1);

    }
}