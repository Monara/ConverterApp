package com.example.asus.converterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Length extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);

        EditText inputBox = findViewById(R.id.inputBox);
        TextView outputBox = findViewById(R.id.outputBox);
        ImageButton buttonRevert = findViewById(R.id.buttonRevert);
        ImageButton buttonConvert = findViewById(R.id.buttonConvert);

        //read the value of drop down, define unitFrom and unitTo
        //needs revision from here

        double insertedNumber = Double.valueOf(inputBox.getText().toString());
        Spinner unitFromSpinner = findViewById(R.id.unitFrom);
       // int iUnitFrom = unitFromSpinner.getSelectedItemPosition();
        Spinner unitToSpinner = findViewById(R.id.unitTo);
        //int iUnitTo = unitToSpinner.getSelectedItemPosition();


        unitFromSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { //nebaigtas
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int iUnitFrom = i;
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }});

        unitToSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { //nebaigtas
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               int iUnitTo = i;
            }
            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }});

        



















            //Converter lengthConverter = new Converter (insertedNumber) { //add spinner values






}


}