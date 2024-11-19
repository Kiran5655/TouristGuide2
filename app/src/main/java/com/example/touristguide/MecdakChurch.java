package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MecdakChurch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mecdak_church);
        ImageView ci = findViewById(R.id.ci1);
        ImageView c2 = findViewById(R.id.ci2);
        ImageView c3 = findViewById(R.id.ci3);

        Picasso.get().load("https://butteroverbae.com/wp-content/uploads/2021/12/gulab-jamun-with-milk-powder-final.jpg").placeholder(R.drawable.appbg).into(ci);
        Picasso.get().load("https://www.indianhealthyrecipes.com/wp-content/uploads/2021/10/rasmalai-recipe.jpg").placeholder(R.drawable.appbg).into(c2);
        Picasso.get().load("https://martmines.com/wp-content/uploads/2021/06/Plain-Ariselu-3.jpg").placeholder(R.drawable.appbg).into(c3);
    }

    public void onbvh(View v) {
        Intent intent = new Intent(this, gulab.class);
        startActivity(intent);

    }

    public void pan(View v) {
        Intent intent = new Intent(this,RASMALAI.class);
        startActivity(intent);

    }
    public void mts(View v) {
        Intent intent = new Intent(this, ARISELU.class);
        startActivity(intent);
    }

}