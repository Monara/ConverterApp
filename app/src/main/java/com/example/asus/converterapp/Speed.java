package com.example.asus.converterapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Speed extends AppCompatActivity {
    private Spinner unitFromSpinner;
    private Spinner unitToSpinner;
    private EditText inputValue;
    private TextView conversionResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed);

        //id for view elements
        unitFromSpinner = findViewById(R.id.unitFrom);
        unitToSpinner = findViewById(R.id.unitTo);
        inputValue = findViewById(R.id.inputBox);
        conversionResult = findViewById(R.id.outputBox);
        ImageButton buttonConvert = findViewById(R.id.buttonConvert);
        ImageButton buttonRevert = findViewById(R.id.buttonRevert);

        //making two spinners with length_array content and designing them as default
        final ArrayAdapter<CharSequence> spinnerAdapter;
        spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.speed_array, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitFromSpinner.setAdapter(spinnerAdapter);
        unitToSpinner.setAdapter(spinnerAdapter);
        unitFromSpinner.setSelection(0);    //which spinner value is selected upon onCreate()

        //BUTTONS
        buttonConvert.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {    //when conversion button is clicked

                String fromUnitName = unitFromSpinner.getSelectedItem().toString();     //we get strings of selected spinner items (needed for calculation switch)
                String toUnitName = unitToSpinner.getSelectedItem().toString();

                if (inputValue.getText().toString().trim().length() == 0) {  // if input box is empty
                    Toast prompt = Toast.makeText(Speed.this, "Please insert a number", Toast.LENGTH_LONG);
                    prompt.show(); //a small pop-up will prompt to add a number
                } else {  //if there is input

                    double finalInputValue = Double.parseDouble(inputValue.getText().toString());     //get input value from the input box

                    double speedConverterResult = Converter.convertSpeedUnits(finalInputValue, fromUnitName, toUnitName);    //get a conversion result
                    conversionResult.setText(Double.toString(speedConverterResult));   //set the conversion result into the output box
                }
            }
        });

        buttonRevert.setOnClickListener(new OnClickListener(){ //when reversion button is clicked
            @Override
            public void onClick(View v) {
                String fromUnitName = unitFromSpinner.getSelectedItem().toString();     //we get strings of selected spinner items
                String toUnitName = unitToSpinner.getSelectedItem().toString();

                int spinnerFrom = spinnerAdapter.getPosition(fromUnitName);
                unitToSpinner.setSelection(spinnerFrom);
                int spinnerTo = spinnerAdapter.getPosition(toUnitName);
                unitFromSpinner.setSelection(spinnerTo);

            }
        });

    }
    //BUTTONS OUTSIDE onCreate()


    public void favouriteButton(View v) {   //directs to favourites
        Intent intent = new Intent(this, Favourite.class);
        startActivity(intent);
    }


}

