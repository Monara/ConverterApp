package com.example.asus.converterapp;

class GlobalModel {
    private static final GlobalModel ourInstance = new GlobalModel();

    static GlobalModel getInstance() {
        return ourInstance;
    }

    private GlobalModel() {
    }
}
