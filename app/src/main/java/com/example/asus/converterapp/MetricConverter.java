package com.example.asus.converterapp;

public class MetricConverter {
    private String unitFrom;
    private String unitTo;
    private double input;

    public MetricConverter(){
        this.input=input;
        this.unitFrom = unitFrom;
        this.unitTo= unitTo;
    }
    public double metricConvert(double input, String unitFrom, String unitTo){
        double result = input;
        if(unitFrom.equals("kilo")){
            if(unitTo.equals("unit")){
                result = input *1000;
            }else if(unitTo.equals("centi")){
                result = input*100000;
            }else if (unitTo.equals("milli")){
                result = input*1000000;
            }else if(unitTo.equals("kilo")){
                result= input;
            }
        }else if (unitFrom.equals("unit")) {
            if (unitTo.equals("kilo")) {
                result = input / 1000;
            } else if (unitTo.equals("centi")) {
                result = input * 100;
            } else if (unitTo.equals("milli")) {
                result = input * 1000;
            } else if (unitTo.equals("unit")) {
                result = input;
            }
        }else if (unitFrom.equals("centi")) {
            if (unitTo.equals("kilo")) {
                result = input / 100000;
            } else if (unitTo.equals("centi")) {
                result = input;
            } else if (unitTo.equals("milli")) {
                result = input * 10;
            } else if (unitTo.equals("unit")) {
                result = input / 100;
            }
        }else if (unitFrom.equals("milli")) {
            if (unitTo.equals("kilo")) {
                result = input / 1000000;
            } else if (unitTo.equals("centi")) {
                result = input / 10;
            } else if (unitTo.equals("milli")) {
                result = input;
            } else if (unitTo.equals("unit")) {
                result = input / 1000;
            }
        }
        return result;
    }

}
