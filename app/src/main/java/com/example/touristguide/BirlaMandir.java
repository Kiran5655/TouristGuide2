package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class BirlaMandir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birla_mandir);
        ImageView ci = findViewById(R.id.ci1);
        ImageView c2 = findViewById(R.id.ci2);
        ImageView c3 = findViewById(R.id.ci3);

        Picasso.get().load("https://www.southernplate.com/wp-content/uploads/2014/04/Tomato-chips.jpg").placeholder(R.drawable.appbg).into(ci);
        Picasso.get().load("https://images.news18.com/ibnkhabar/uploads/2021/12/potato-chips.jpg").placeholder(R.drawable.appbg).into(c2);
        Picasso.get().load("https://1.bp.blogspot.com/-5rrpZp-6Q8Y/Xs7VtkpuVOI/AAAAAAAAKEo/q-_IRK84kRwdAPkLmdWs0E8VhhRsQqAbQCLcBGAsYHQ/s1600/Bhel%2BPuri%2BRecipe.JPG").placeholder(R.drawable.appbg).into(c3);
    }

    public void onbvh(View v) {
        Intent intent = new Intent(this, tomato.class);
        startActivity(intent);

    }

    public void pan(View v) {
        Intent intent = new Intent(this,pota.class);
        startActivity(intent);

    }
    public void mts(View v) {
        Intent intent = new Intent(this, bhel.class);
        startActivity(intent);
    }


}