package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class shoulder extends AppCompatActivity {
    TextView intropage;
    TextView subintropage;
    TextView titlepage;
    TextView subtitlepage;
    TextView timerValue;
    View divpage;
    LinearLayout shoulder;
    ImageView imageTimer;

    private static final long START_TIME_IN_MILLIS = 62000;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    Animation animone;
    Animation animtwo;

    Animation alphago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);

        getSupportActionBar().hide();
        animone = AnimationUtils.loadAnimation(this, R.anim.animone);
        animtwo = AnimationUtils.loadAnimation(this, R.anim.animtwo);
        alphago = AnimationUtils.loadAnimation(this, R.anim.alphago);


        intropage = (TextView) findViewById(R.id.intropage_shoulder);
        subintropage = (TextView) findViewById(R.id.subintropage_shoulder);
        titlepage = (TextView) findViewById(R.id.shouldertitle);
        subtitlepage = (TextView) findViewById(R.id.shoulderinfo);
        timerValue = (TextView) findViewById(R.id.timer_shoulder);

        divpage = (View) findViewById(R.id.divpage_shoulder);

        shoulder = (LinearLayout) findViewById(R.id.shoulder);

        imageTimer = (ImageView) findViewById(R.id.imageTimer_shoulder);

        shoulder.startAnimation(animone);
        intropage.startAnimation(animtwo);
        subintropage.startAnimation(animtwo);
        divpage.startAnimation(animtwo);
        timerValue.startAnimation(alphago);
        imageTimer.startAnimation(alphago);

        startTimer();
    }

    private void startTimer(){
        CountDownTimer countDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long l) {
                mTimeLeftInMillis = l;
                updateCountDownText();
            }

            @Override
            public void onFinish() {

            }
        }.start();
        boolean mTimerRunning = true;
    }

    private void updateCountDownText(){
        int minutes= (int) (mTimeLeftInMillis/1000) / 60;
        int seconds = (int) (mTimeLeftInMillis/1000) % 60;

        String timeLeft = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timerValue.setText(timeLeft);
    }
}