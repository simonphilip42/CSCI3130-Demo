package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);
        textView.setText("Hello World!");

        final Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
          public void onClick(View v) {
              final EditText input = findViewById(R.id.editText);
              String textInput = input.getText().toString();

              final TextView textView = findViewById(R.id.textView);
              textView.setText(textInput);
          }
        });
    }
}
