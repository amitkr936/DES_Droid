package com.example.amitkrishna.desdroid;
/*
* Android Application which implements DES Encryption Algorithm
* @Author: Amit Krishna
* www.amitkrishna.me
* Link :-https://www.linkedin.com/in/amit-krishna-3b53b1139/
* */
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home_int=new Intent(MainActivity.this,home.class);
                startActivity(home_int);
                finish();

            }
        },SPLASH_TIME_OUT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
