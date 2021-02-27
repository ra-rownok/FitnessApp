package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class Bisep extends AppCompatActivity {

    TextView subintropage;
    TextView titlepage;
    TextView subtitlepage;
    TextView timerValue;
    View divpage;
    LinearLayout chest;
    ImageView imageTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bisep);




        subintropage = (TextView) findViewById(R.id.subintropage);
        titlepage = (TextView) findViewById(R.id.title);
        subtitlepage = (TextView) findViewById(R.id.subtitlepage);
        timerValue = (TextView) findViewById(R.id.timer);

        divpage = (View) findViewById(R.id.divpage_legs);

        chest = (LinearLayout) findViewById(R.id.legs);

        imageTimer = (ImageView) findViewById(R.id.imageTimer_legs);

        startTimer();
    }

    private void startTimer(){


    }

    private void updateCountDownText(){

    }
}