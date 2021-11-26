package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int secondsDelayed = 2500;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() { startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                finish();
            }
        }, secondsDelayed);
    }
}
