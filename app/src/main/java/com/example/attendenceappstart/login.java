package com.example.attendenceappstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class login extends AppCompatActivity {
    EditText mobileNumber;
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mobileNumber = findViewById(R.id.phoneNumber);
        textView = findViewById(R.id.instruction);
        button = findViewById(R.id.getOtpButton);


        }

    public void getotp(View view) {

            Intent intent=new Intent(this,adminRegistation.class);
            startActivity(intent);

    }

    public void EmpPage(View view) {
        Intent intent=new Intent(this,Employee_Login.class);
        startActivity(intent);
    }
}




