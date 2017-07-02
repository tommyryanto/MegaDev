package com.example.tommyryanto.bmicalc;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {
    private static int Splash =3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pindah =new Intent(splash.this,MainActivity.class);
                startActivity(pindah);
                finish();
            }
        },Splash);    }

    }



