package com.example.asus.converterapp;

import java.util.ArrayList;
import java.util.List;

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
}
