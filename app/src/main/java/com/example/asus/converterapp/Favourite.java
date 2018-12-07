package com.example.asus.converterapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

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

        ListView lv= (ListView)findViewById(R.id.list_view);
        lv.setAdapter(new ArrayAdapter<FavoriteList>(this, R.layout.list_item, GlobalModel.getInstance().getLists()
        ));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent nextActivity = new Intent(Favourite.this, ListDetailsActivity.class);
                nextActivity.putExtra("favorite", i);
                startActivity(nextActivity);
            }
        });


    }

}
