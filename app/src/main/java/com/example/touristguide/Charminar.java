package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Charminar extends AppCompatActivity {
    ImageView ci, c2, c3, c4, c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charminar);
        ci = findViewById(R.id.ci1);
        c2 = findViewById(R.id.ci2);
        c3 = findViewById(R.id.ci3);
        c5 = findViewById(R.id.ci5);
        c4 = findViewById(R.id.ci4);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRNJbY56VXMAkF0U5cXzjKAE01IrNq1KiToTg&usqp=CAU").placeholder(R.drawable.appbg).into(ci);
        Picasso.get().load("https://static.toiimg.com/thumb/63841432.cms?width=1200&height=900").placeholder(R.drawable.appbg).into(c2);
        Picasso.get().load("https://static.onecms.io/wp-content/uploads/sites/19/2008/05/14/eggs-on-potato-chips-su.jpg").placeholder(R.drawable.appbg).into(c3);
        Picasso.get().load("https://www.vegrecipesofindia.com/wp-content/uploads/2021/04/methi-paratha-4-500x500.jpg").placeholder(R.drawable.appbg).into(c4);
        Picasso.get().load("https://www.indianhealthyrecipes.com/wp-content/uploads/2019/04/bread-omelette-500x500.jpg").placeholder(R.drawable.appbg).into(c5);
    }

    public void onbvh(View v) {
        Intent intent = new Intent(this, idly.class);
        startActivity(intent);

    }

    public void DOS(View v) {
        Intent intent = new Intent(this, dosa.class);
        startActivity(intent);

    }
    public void mt(View v) {
        Intent intent = new Intent(this, roti.class);
        startActivity(intent);
    }

    public void pot(View v) {
        Intent intent = new Intent(this, Potato.class);
        startActivity(intent);
    }
    public void bt(View v) {
        Intent intent = new Intent(this, bread.class);
        startActivity(intent);
    }
}