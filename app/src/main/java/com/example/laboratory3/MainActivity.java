package com.example.laboratory3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mmabtn = findViewById(R.id.mmabtn);
        Button ppabtn = findViewById(R.id.ppabtn);

           mmabtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,secpage.class);
                   startActivity(intent);

               }
           });

           ppabtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent=new Intent(MainActivity.this,trdpage.class);
                   startActivity(intent);
               }
           });

            }
    }

