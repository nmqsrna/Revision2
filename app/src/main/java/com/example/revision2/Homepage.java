package com.example.revision2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {

    public final static String USERNAME = "com.example.Revision2.username";

    TextView tv_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        tv_username = findViewById(R.id.tvUsername);

        Intent intent = getIntent();

        String username = intent.getStringExtra(USERNAME);

        tv_username.setText(username);
        tv_username.setTextSize(30);

    }
}