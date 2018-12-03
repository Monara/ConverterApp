package com.example.asus.converterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Length extends AppCompatActivity {
    private Spinner fromSpinner;
    private Spinner toSpinner;
    private EditText inputValue;
    private TextView convertResult;
    private LengthUnit lengthUnit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);

        fromSpinner = (Spinner)findViewById(R.id.unitFrom);
        toSpinner = (Spinner) findViewById(R.id.unitTo);
        inputValue = (EditText) findViewById(R.id.inputBox);
        convertResult = (TextView) findViewById(R.id.outputBox);

        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter.createFromResource(this, R.array.length_arrays, android.R.layout.simple_spinner_item);
        fromSpinner.setAdapter(staticAdapter);
        toSpinner.setAdapter(staticAdapter);
        fromSpinner.setSelection(1);

        ImageButton buttonRevert = (ImageButton) findViewById(R.id.buttonRevert);
        buttonRevert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String convertFromUnit = fromSpinner.getSelectedItem().toString();
                String convertToUnit = toSpinner.getSelectedItem().toString();
                convertFromUnit = convertToUnit;
                convertToUnit = convertFromUnit;
            }
        });

        ImageButton buttonConvert = (ImageButton) findViewById(R.id.buttonConvert);
        buttonConvert.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                checkIfFieldIsEmpty(inputValue);
                String convertFromUnit = fromSpinner.getSelectedItem().toString();
                String convertToUnit = toSpinner.getSelectedItem().toString();
                double userInputValue = returnErrorInputs(inputValue);
                lengthUnit = new LengthUnit();
                double returnedConvertedResult = lengthUnit.convert(userInputValue,convertFromUnit, convertToUnit);
                convertResult.setText(String.valueOf(String.format("%.2f", returnedConvertedResult)));


            }

        });
    }

        private double returnErrorInputs(EditText input){
            double returnedInput = 0.0;
            String inputValue = input.getText().toString();
            if(inputValue.equals(".")){
                returnedInput = 0.0;
            }
            else if(inputValue.contains("..")){
                returnedInput = 0.0;
            }
            else{
                returnedInput = Double.parseDouble(inputValue);
            }
            return returnedInput;
        }
        private void checkIfFieldIsEmpty(EditText checkContent){
            if(checkContent.getText().toString().equals("")){
            Toast.makeText(Length.this, "Input field must be filled", Toast.LENGTH_LONG).show();
            return;
        }
    }
        }



