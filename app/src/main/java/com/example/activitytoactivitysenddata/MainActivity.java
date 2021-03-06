package com.example.activitytoactivitysenddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,email,phone;
    Button signup;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextName);
        email = findViewById(R.id.editTextEmail);
        phone = findViewById(R.id.editTextPhone);
        signup = findViewById(R.id.buttonSignUp);

        signup.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick( View view ) {
                String userName = name.getText().toString();
                String userEmail = email.getText().toString();
              Integer phoneNumber = Integer.valueOf(phone.getText().toString());
               
                Intent i;
                i = new Intent( MainActivity.this,SecondActivity.class);
                i.putExtra("name", userName);
                i.putExtra("email",userEmail);
                i.putExtra("phone",phoneNumber);

                startActivity(i);
            }
        });
    }
}