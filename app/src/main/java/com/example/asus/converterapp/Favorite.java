package com.example.asus.converterapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Favorite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        ListView lv= (ListView)findViewById(R.id.list_view);
        lv.setAdapter(new ArrayAdapter<FavoriteList>(this, R.layout.list_item, GlobalModel.getInstance().getLists()
                ));
        lv.setOnClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent nextActivity = new Intent(Favorite.this, ListDetailsActivity.class);
            nextActivity.putExtra("favorite", i);
            startActivity(nextActivity);
        }
    });




    }

}
