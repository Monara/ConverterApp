package com.example.asus.converterapp;

public class LengthConverter {

    public double convertUnits (double inserted, String fromUnit, String toUnit) {

        double result = 0.0; //will hold result value

        String fU = fromUnit.toLowerCase();
        String tU = toUnit.toLowerCase();

        switch(fU) {
            case "millimetre": { //first spinner selected as millimetre
                switch(tU) { //second spinner selections
                    case "millimetre": result = inserted; break;
                    case "centimetre": result = inserted * 0.1d; break;
                    case "metre": result = inserted * 0.001d; break;
                    case "kilometre": result = inserted * 0.000001d; break;
                    case "mile": result = inserted * 0.0000006213712d; break;
                    case "feet": result = inserted * 0.00328084d; break;
                    case "yard": result = inserted * 0.0010936133333d; break;
                }
                break;
            }
            case "centimetre": {
                switch(tU) {
                    case "millimetre": result = inserted * 0.1d; break;
                    case "centimetre": result = inserted; break;
                    case "metre": result = inserted * 0.1d; break;
                    case "kilometre": result = inserted * 0.00001d; break;
                    case "mile": result = inserted * 0.000006213712d; break;
                    case "feet": result = inserted * 0.0328084d; break;
                    case "yard": result = inserted * 0.01093613d; break;
                }
                break;
            }
            case "metre": {
                switch(tU) {
                    case "millimetre": result = inserted * 1000d; break;
                    case "centimetre": result = inserted * 100d; break;
                    case "metre": result = inserted; break;
                    case "kilometre": result = inserted * 0.001d; break;
                    case "mile": result = inserted * 0.0006213712d; break;
                    case "feet": result = inserted * 3.28084d; break;
                    case "yard": result = inserted * 1.093613d; break;
                }
                break;
            }
            case "kilometre": {
                switch(tU){
                    case "millimetre": result = inserted * 1000000d; break;
                    case "centimetre": result = inserted * 100000d; break;
                    case "metre": result = inserted * 1000d; break;
                    case "kilometre": result = inserted; break;
                    case "mile": result = inserted * 0.6213712d; break;
                    case "feet": result = inserted * 3280.84d; break;
                    case "yard": result = inserted * 1093.613d; break;
                }
                break;
            }
            case "mile": {
                switch(tU) {
                    case "millimetre": result = inserted * 1609344d; break;
                    case "centimetre": result = inserted * 160934.4d; break;
                    case "metre": result = inserted * 1609.344d; break;
                    case "kilometre": result = inserted * 1.609344d; break;
                    case "mile": result = inserted; break;
                    case "feet": result = inserted * 5280d; break;
                    case "yard": result = inserted * 1760d; break;
                }
                break;
            }
            case "feet": {
                switch(tU) {
                    case "millimetre": result = inserted * 304.8d; break;
                    case "centimetre": result = inserted * 30.48d; break;
                    case "metre": result = inserted * 0.3048d; break;
                    case "kilometre": result = inserted * 0.0003048d; break;
                    case "mile": result = inserted * 0.0001893939d; break;
                    case "feet": result = inserted; break;
                    case "yard": result = inserted * 0.3333333d; break;
                }
                break;
            }
            case "yard": {
                switch(tU) {
                    case "millimetre": result = inserted * 914.4d; break;
                    case "centimetre": result = inserted * 91.44d; break;
                    case "metre": result = inserted * 0.9144d; break;
                    case "kilometre": result = inserted * 0.0009144d; break;
                    case "mile": result = inserted * 0.0005681818d; break;
                    case "feet": result = inserted * 3d; break;
                    case "yard": result = inserted; break;
                }
                break;
            }
        }

        return result;
    }

}
