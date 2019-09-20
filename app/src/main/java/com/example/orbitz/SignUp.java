package com.example.orbitz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    Button loginLbl;
    Button navi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        loginLbl = findViewById(R.id.loginBtn);
        loginLbl.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
               Intent intent2 = new Intent(getApplicationContext(),MainActivity.class);
               startActivity(intent2);
            }
        });

        navi = findViewById(R.id.naviBtn);
        navi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(),Home.class);
                startActivity(intent3);
            }
        });

    }
}
