package com.example.touristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
public class Turistplaces extends AppCompatActivity {
   ImageView i,i2,i3,i4,i5,i6,i7,i8;
   Button b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turistplaces);
        i = findViewById(R.id.i);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        i4 = findViewById(R.id.i4);
        i5 = findViewById(R.id.i5);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);





        Picasso.get().load("https://media-cdn.tripadvisor.com/media/photo-s/17/57/7d/17/2-egg-breakfast.jpg").placeholder(R.drawable.appbg).into(i);
        Picasso.get().load("https://veenaazmanov.com/wp-content/uploads/2017/03/Hyderabad-Chicken-Biryani-Dum-Biryani-Kachi-Biryani4.jpg").placeholder(R.drawable.appbg).into(i2);
        Picasso.get().load("https://www.southernplate.com/wp-content/uploads/2014/04/Tomato-chips.jpg").placeholder(R.drawable.appbg).into(i3);
        Picasso.get().load("https://butteroverbae.com/wp-content/uploads/2021/12/gulab-jamun-with-milk-powder-final.jpg").placeholder(R.drawable.appbg).into(i4);
        Picasso.get().load("https://www.sanjeevkapoor.com/UploadFiles/RecipeImages/Badam-Milk.jpg").placeholder(R.drawable.appbg).into(i5);



    }
        public void open(View v) {
            Intent intent=new Intent(this,Charminar.class);
            startActivity(intent);
        }

    public void meal(View v) {
        Intent intent=new Intent(this,GOLCONDA.class);
        startActivity(intent);
    }
    public void opencn(View v) {
        Intent intent=new Intent(this,BirlaMandir.class);
        startActivity(intent);
    }
    public void ope(View v) {
        Intent intent=new Intent(this,MecdakChurch.class);
        startActivity(intent);
    }
    public void oe(View v) {
        Intent intent=new Intent(this,MecdakChurch.class);
        startActivity(intent);
    }
    public void oem(View v) {
        Intent intent=new Intent(this,MallelaTheertham.class);
        startActivity(intent);
    }
    public void papi(View v) {
        Intent intent=new Intent(this,Papikondalu.class);
        startActivity(intent);
    }
    public void bas(View v) {
        Intent intent=new Intent(this,Basara.class);
        startActivity(intent);
    }


}