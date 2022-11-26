package com.example.attendenceappstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class adminRegistation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_registation);
    }

    public void adminLogin(View view) {
        Intent intent = new Intent(this, adminLogin.class);
        startActivity(intent);
    }
}