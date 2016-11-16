package com.example.personal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void sig1 (View view){
        Intent i = new Intent(this,Main8Activity.class);
        startActivity(i);
    }
    public void atras1 (View view){
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }
}
