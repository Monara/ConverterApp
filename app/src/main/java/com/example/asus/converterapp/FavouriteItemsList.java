package com.example.asus.converterapp;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class FavouriteItemsList {

    private static ArrayList<FavouriteItem> items = new ArrayList<>();

    public static void addToFavouriteList (FavouriteItem item) {
        items.add(item);
    }

    public static String toJsonString() {
        Gson gson = new Gson();
        String json = gson.toJson(items);
        return json;
    }

    public static void fromJsonString(String jsonString) {
        Gson gson = new Gson();
        if (jsonString.length() == 0) {
            return;     //early out if string is empty. Crashes otherwise
        }
        TypeToken<ArrayList<FavouriteItem>> token = new TypeToken<ArrayList<FavouriteItem>>() {};
        items = gson.fromJson(jsonString, token.getType());
    }

    public static ArrayList<FavouriteItem> getArray () {
        return items;
    }
}
