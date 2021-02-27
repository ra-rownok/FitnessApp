package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titlepage, subtitlepage, intropage, subintropage, chesttitle, chestinfo, biceptitle, bicepinfo, shouldertitle, shoulderinfo, legtitle, leginfo;
    LinearLayout chest,leg,bicep,shoulder;
    ImageView imageView;
    View divpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titlepage = (TextView) findViewById(R.id.titlepage);
        subtitlepage = (TextView) findViewById(R.id.subtitlepage);
        intropage = (TextView) findViewById(R.id.intropage);
        subintropage = (TextView) findViewById(R.id.subintropage);

        chesttitle = (TextView) findViewById(R.id.chesttitle);
        chestinfo = (TextView) findViewById(R.id.chestinfo);
        biceptitle = (TextView) findViewById(R.id.biceptitle);
        bicepinfo = (TextView) findViewById(R.id.bicepinfo);
        shouldertitle = (TextView) findViewById(R.id.shouldertitle);
        shoulderinfo = (TextView) findViewById(R.id.shoulderinfo);
        legtitle = (TextView) findViewById(R.id.legtitle);
        leginfo = (TextView) findViewById(R.id.leginfo);

        chesttitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Workout.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        biceptitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Workout.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        shouldertitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Workout.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

        legtitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, Workout.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });


        chest = (LinearLayout) findViewById(R.id.chest);
        bicep = (LinearLayout) findViewById(R.id.bicep);
        leg = (LinearLayout) findViewById(R.id.leg);
        shoulder = (LinearLayout) findViewById(R.id.shoulder);

        imageView = (ImageView) findViewById(R.id.imageView);


        divpage = (View) findViewById(R.id.divpage);


    }
}