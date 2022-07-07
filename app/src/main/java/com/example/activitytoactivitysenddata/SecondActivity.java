package com.example.activitytoactivitysenddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView name,email,phone;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         name = findViewById(R.id.textViewName);
      email = findViewById(R.id.textViewEmail);
     phone = findViewById(R.id.textViewPhone);

        Intent i = getIntent();
         String userName = i.getStringExtra("name");
         String userEmail = i.getStringExtra("email");

        int userPhone = i.getIntExtra("phone", 0);
        name.setText("Hello " + userName);
        email.setText("Your email address is " + " " + userEmail);
        phone.setText("Phone Number " + "  " + String.valueOf(userPhone));
        Toast.makeText(getApplicationContext(), userName,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), userEmail,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), String.valueOf(userPhone),Toast.LENGTH_LONG).show();


    }
}