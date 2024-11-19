package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class GOLCONDA extends AppCompatActivity {
   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golconda);
        ImageView ci = findViewById(R.id.ci1);
        ImageView c2 = findViewById(R.id.ci2);
        ImageView c3 = findViewById(R.id.ci3);

        Picasso.get().load("https://veenaazmanov.com/wp-content/uploads/2017/03/Hyderabad-Chicken-Biryani-Dum-Biryani-Kachi-Biryani4.jpg").placeholder(R.drawable.appbg).into(ci);
        Picasso.get().load("https://images.news18.com/ibnkhabar/uploads/2020/10/shahi-paneer.jpg").placeholder(R.drawable.appbg).into(c2);
        Picasso.get().load("https://static.toiimg.com/thumb/61709928.cms?width=1200&height=900").placeholder(R.drawable.appbg).into(c3);
        }

    public void onbvh(View v) {
        Intent intent = new Intent(this, briyani.class);
        startActivity(intent);

    }

    public void pan(View v) {
        Intent intent = new Intent(this,paneer.class);
        startActivity(intent);

    }
    public void mts(View v) {
        Intent intent = new Intent(this, briyani.class);
        startActivity(intent);
    }


}