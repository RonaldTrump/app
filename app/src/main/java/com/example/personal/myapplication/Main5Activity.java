package com.example.personal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void sig (View view){
        Intent i = new Intent(this,Main6Activity.class);
        startActivity(i);
    }
    public void volver (View view){
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);
    }

}
