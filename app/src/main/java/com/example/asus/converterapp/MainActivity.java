package com.example.asus.converterapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.converter.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void lengthButton(View v) {
        Intent intent = new Intent(this, Length.class);
        startActivity(intent);
    }


    public void favouriteButton(View v){
        Intent intent = new Intent(this,Favourite.class);
        startActivity(intent);
    }

}



