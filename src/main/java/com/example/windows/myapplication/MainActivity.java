package com.example.windows.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTry(View view) {
        EditText editText = findViewById(R.id.editText );
        String intentText = String.valueOf(editText.getText());


        Button button = (Button) view;

        Log.e("test button", String.valueOf(button.getText()));

        if(button.getText().toString().equals("Try4")){
            Intent intent = new Intent(this, IntentActivity.class);
            intent.putExtra( "message", "You are right");
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, IntentActivity.class);
            intent.putExtra( "message", "You are loser");
            startActivity(intent);
        }
    }
}
