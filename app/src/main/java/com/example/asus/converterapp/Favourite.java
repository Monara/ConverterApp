package com.example.asus.converterapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;


public class Favourite extends AppCompatActivity {

    private static final String FROMUNIT ="fromUnit";
    private static final String TOUNIT ="toUnit";
    private static final String INPUT ="input";
    private static final String RESULT ="result";
    private static final String PREF = "sharepreference";
    private String spinnerFrom;
    private String spinnerTo;
    private double input;
    private double result;
    private ListView listView;
    private CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        ListView lv= (ListView)findViewById(R.id.list_view);
        SharedPreferences getValue = getSharedPreferences(PREF,MODE_PRIVATE);

        for(int i= 0; i<10; i++) {
            spinnerFrom = getValue.getString(FROMUNIT + i, "nothing");
            spinnerTo = getValue.getString(TOUNIT + i, "nothing");
            input = getValue.getFloat(INPUT + i, 0);
            result = getValue.getFloat(RESULT + i, 0);
        }
        List<FavouriteList> lists =  new ArrayList<FavouriteList>();
        lists.add(new FavouriteList(spinnerFrom,spinnerTo,input,result));

        adapter = new CustomAdapter(this,  lists);
        listView.setAdapter(adapter);

    }
    public class CustomAdapter extends ArrayAdapter<FavouriteList>{
          private Context mContext;
          private List<FavouriteList> lists = new ArrayList<FavouriteList>();

        public CustomAdapter(Context context, ArrayList<FavouriteList> list) {
            super(context,0, list);
            mContext = context;
            lists = list;
        }
        public View getView(final int position, View convertView, ViewGroup parent) {
            View listItem = convertView;
            if(listItem == null)
                listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
            FavouriteList currentItem = lists.get(position);

            ImageButton image = (ImageButton)listItem.findViewById(R.id.imageButton);
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    lists.remove(position);
                }
            });

            TextView fromUnit = (TextView) listItem.findViewById(R.id.fromUnit);
            fromUnit.setText(currentItem.getSpinnerFrom());

            TextView toUnit = (TextView) listItem.findViewById(R.id.toUnit);
            toUnit.setText(currentItem.getSpinnerTo());

            TextView input = (TextView) listItem.findViewById(R.id.input);
            input.setText(currentItem.getInput());

            TextView result = (TextView) listItem.findViewById(R.id.result);
            result.setText(currentItem.getResult());

            return listItem;
        }

}
