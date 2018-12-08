package com.example.asus.converterapp;

public class FavouriteList {
        private String spinnerFrom;
        private String spinnerTo;
        private double input;
        private double result;

        public FavouriteList(String spinnerFrom, String spinnerTo, double input, double result ){
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
            return "Conversion [From " + spinnerFrom  + ", to" + spinnerTo + ", input="
                    + input + ", =" + result + "]";
        }
    }
