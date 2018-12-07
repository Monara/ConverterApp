package com.example.asus.converterapp;

public class FavoriteList {
    private String spinnerFrom;
    private String spinnerTo;
    private double input;
    private double result;

    public FavoriteList(String spinnerFrom, String spinnerTo, double input, double result ){
        this.spinnerFrom = spinnerFrom;
        this.spinnerTo = spinnerTo;
        this.input = input;
        this.result = result;
    }
    public String getInput(){
        return Double.toString(this.input);
    }
    public String getResult(){
        return Double.toString(this.result);
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
