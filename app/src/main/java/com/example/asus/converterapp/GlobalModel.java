package com.example.asus.converterapp;

import java.util.ArrayList;
import java.util.List;




public class GlobalModel {

        private List<FavouriteList> lists;
        private static final GlobalModel ourInstance = new GlobalModel();


        static GlobalModel getInstance() {
            return ourInstance;
        }

    private GlobalModel() {
            this.lists = new ArrayList<>();
        }

        public List<FavouriteList> getLists(){
            return lists;
        }

        public FavouriteList getFavorite(int i){
            return lists.get(i);
        }

        public void addItem(String spinnerFrom, String spinnerTo, double input, double result ){
            lists.add(new FavouriteList(spinnerFrom,spinnerTo,input,result));
        }

    }

