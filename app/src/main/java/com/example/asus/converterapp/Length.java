package com.example.asus.converterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Length extends AppCompatActivity {
    private Spinner fromSpinner;
    private Spinner toSpinner;
    private EditText inputValue;
    private TextView convertResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);

        fromSpinner = (Spinner)findViewById(R.id.unitFrom);
        toSpinner = (Spinner) findViewById(R.id.unitTo);
        inputValue = (EditText) findViewById(R.id.inputBox);
        convertResult = (TextView) findViewById(R.id.outputBox);


        ImageButton buttonRevert = (ImageButton) findViewById(R.id.buttonRevert);

        ImageButton buttonConvert = (ImageButton) findViewById(R.id.buttonConvert);

    }
}


