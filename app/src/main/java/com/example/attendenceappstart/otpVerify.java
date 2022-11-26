package com.example.attendenceappstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class otpVerify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verify);
    }

    public void adminRegistration(View view) {
        Intent intent = new Intent(this, adminRegistation.class);
        startActivity(intent);
    }
}