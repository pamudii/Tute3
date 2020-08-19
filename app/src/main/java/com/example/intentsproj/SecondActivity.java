package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String takeExtra;
    String takeExtra2;
    TextView txt;
    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt = findViewById(R.id.txtMessage);
        txt2 = findViewById(R.id.txtMessage2);

        Intent myIntent = getIntent();
        takeExtra = myIntent.getStringExtra("MAIN_EXTRA");

        Intent myIntent2 = getIntent();
        takeExtra2 = myIntent.getStringExtra("MAIN_EXTRA2");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        txt.setText(takeExtra);
        txt2.setText(takeExtra2);
    }
}