package com.imroatusholihah.simplegofood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgIcon, imgMart, imgFood, imgRide, imgSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgIcon = (ImageView) findViewById(R.id.logoHitam);
        imgMart = (ImageView) findViewById(R.id.imgGoMart);
        imgRide = (ImageView) findViewById(R.id.imgGoRide);
        imgSend = (ImageView) findViewById(R.id.imgGoSend);
        imgFood = (ImageView) findViewById(R.id.imgGoFood);

        imgFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foods = new Intent(getApplicationContext(), GoFood.class);
                startActivity(foods);
            }
        });

    }

}
