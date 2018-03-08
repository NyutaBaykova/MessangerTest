package com.example.windows.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Intent intent = getIntent();
        String test = intent.getStringExtra("message");
        TextView textView = findViewById(R.id.textView);
        textView.setText(test);
    }


}
