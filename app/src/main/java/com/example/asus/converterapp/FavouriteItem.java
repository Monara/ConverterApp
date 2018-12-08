package com.example.asus.converterapp;

public class FavouriteItem {
        private String unitFrom;
        private String unitTo;
        private double input;
        private double result;

        public FavouriteItem (String unitFrom, String unitTo, double input, double result ){
            this.unitFrom = unitFrom;
            this.unitTo = unitTo;
            this.input = input;
            this.result = result;
        }
        public String getInput(){
            return Double.toString(this.input);
        }
        public String getResult(){
            return Double.toString(this.result);
        }
        public String getUnitFrom(){
            return this.unitFrom;
        }
        public String getUnitTo(){
            return this.unitTo;
        }
        public String toString(){
            return this.unitFrom + " to " + this.unitTo + "\n" + this.input + " to " + this.result;
        }
    }

