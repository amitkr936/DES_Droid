package com.example.amitkrishna.desdroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class Result extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textView=(TextView) findViewById(R.id.result);
        String op=getIntent().getStringExtra("encry");
        textView.setText("Encrypted Text is : "+op);
    }
}
