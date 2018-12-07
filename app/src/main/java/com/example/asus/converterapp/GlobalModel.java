package com.example.asus.converterapp;

import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class GlobalModel {
    private List<FavoriteList> lists;
    private static final GlobalModel ourInstance = new GlobalModel();


    static GlobalModel getInstance() {
        return ourInstance;
    }

    private GlobalModel() {
        this.lists = new ArrayList<>();

    }
    public List<FavoriteList> getLists(){
        return lists;
    }
    public FavoriteList getFavorite(int i){
        return lists.get(i);
    }
    public void addItem(String spinnerFrom, String spinnerTo, double input, double result ){
        lists.add(new FavoriteList(spinnerFrom,spinnerTo,input,result));
    }
}
