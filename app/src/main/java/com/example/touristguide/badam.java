package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class badam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badam);
        ImageView id1 = findViewById(R.id.bi1);
        Picasso.get().load("https://www.sanjeevkapoor.com/UploadFiles/RecipeImages/Badam-Milk.jpg").placeholder(R.drawable.appbg).into(id1);

    }
}