package com.example.asus.converterapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;


public class Favourite extends AppCompatActivity {
    private Spinner unitFromSpinner;
    private Spinner unitToSpinner;
    private EditText inputValue;
    private TextView conversionResult;
    private static final String FROMUNIT ="fromUnit";
    private static final String TOUNIT ="toUnit";
    private static final String INPUT ="input";
    private static final String RESULT ="result";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        ListView lv = findViewById(R.id.list_view);
        lv.setAdapter(new ArrayAdapter<FavouriteItem>(this, android.R.layout.simple_list_item_1, FavouriteItemsList.getArray()));


    }



}
