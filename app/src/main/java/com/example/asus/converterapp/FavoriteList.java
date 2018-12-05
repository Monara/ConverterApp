package com.example.asus.converterapp;

public class FavoriteList {
    private String spinnerFrom;
    private String spinnerTo;
    private int input;
    private int result;

    public FavoriteList(String spinnerFrom,String spinnerTo, int input, int result ){
        this.spinnerFrom = spinnerFrom;
        this.spinnerTo = spinnerTo;
        this.input = input;
        this.result = result;
    }
    public String getInput(){
        return Integer.toString(this.input);
    }
    public String getResult(){
        return Integer.toString(this.result);
    }
    public String getSpinnerFrom(){
        return this.spinnerFrom;
    }
    public String getSpinnerTo(){
        return this.spinnerTo;
    }
    public String toString(){
        return this.spinnerFrom + " to " + this.spinnerTo;
    }
}
