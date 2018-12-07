package com.example.asus.converterapp;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class ListDetailsActivity extends AppCompatActivity {
    private Spinner unitFromSpinner;
    private Spinner unitToSpinner;
    private EditText inputValue;
    private TextView conversionResult;
    private static final String FROMUNIT ="fromUnit";
    private static final String TOUNIT ="toUnit";
    private static final String INPUT ="input";
    private static final String RESULT ="result";
    private List<FavoriteList> favor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details);

        //id for view elements
        unitFromSpinner = findViewById(R.id.unitFrom);
        unitToSpinner = findViewById(R.id.unitTo);
        inputValue = findViewById(R.id.inputBox);
        conversionResult = findViewById(R.id.outputBox);
        ImageButton buttonConvert = findViewById(R.id.buttonConvert);
        ImageButton buttonRevert = findViewById(R.id.buttonRevert);

        //making two spinners with length_array content and designing them as default
        final ArrayAdapter<CharSequence> spinnerAdapter;
        spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.length_array, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitFromSpinner.setAdapter(spinnerAdapter);
        unitToSpinner.setAdapter(spinnerAdapter);

        SharedPreferences fromUnit = getSharedPreferences(FROMUNIT,MODE_PRIVATE);
        int spinnerFrom = spinnerAdapter.getPosition(fromUnit.getString(FROMUNIT, "nothing" ));
        unitFromSpinner.setSelection(spinnerFrom);

        SharedPreferences toUnit = getSharedPreferences(TOUNIT,MODE_PRIVATE);
        int spinnerTo = spinnerAdapter.getPosition(toUnit.getString(TOUNIT, "nothing"));
        unitToSpinner.setSelection(spinnerTo);

        SharedPreferences input = getSharedPreferences(INPUT,MODE_PRIVATE);
        inputValue.setText(Double.toString(input.getFloat(INPUT, 0)));


        SharedPreferences result = getSharedPreferences(RESULT,MODE_PRIVATE);
        conversionResult.setText(Double.toString(result.getFloat(RESULT, 0)));



        //BUTTONS
        buttonConvert.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){    //when conversion button is clicked

                String fromUnitName = unitFromSpinner.getSelectedItem().toString();     //we get strings of selected spinner items (needed for calculation switch)
                String toUnitName = unitToSpinner.getSelectedItem().toString();

//HERE!
                double finalInputValue = Double.parseDouble(inputValue.getText().toString());     //get input value from the input box

                LengthConverter lengthConverter = new LengthConverter(); //new object for executing conversion
                double lengthConverterResult = lengthConverter.convertUnits(finalInputValue, fromUnitName, toUnitName);    //get a conversion result
                conversionResult.setText(Double.toString(lengthConverterResult));   //set the conversion result into the output box
            }
        });

        buttonRevert.setOnClickListener(new View.OnClickListener(){ //when reversion button is clicked
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
}
