package com.example.asus.converterapp;

public class SpeedConverter {

    public double convertSpeedUnits(double inserted, String fromUnit, String toUnit) {

        double result = 0.0; //will hold result value

        String fU = fromUnit.toLowerCase();
        String tU = toUnit.toLowerCase();

        switch (fU) {
            case "m/s": { //first spinner selected as millimetre
                switch (tU) { //second spinner selections
                    case "m/s":
                        result = inserted;
                        break;
                    case "ft/s":
                        result = inserted * 3.28084d;
                        break;
                    case "mi/h":
                        result = inserted * 2.236936d;
                        break;
                    case "km/h":
                        result = inserted * 3.6d;
                        break;
                }
                break;
            }
            case "ft/s": {
                switch (tU) {
                    case "m/s":
                        result = inserted * 0.3048d;
                        break;
                    case "ft/s":
                        result = inserted;
                        break;
                    case "mi/h":
                        result = inserted * 0.6818182d;
                        break;
                    case "km/h":
                        result = inserted * 1.097280033d;
                        break;
                }
                break;
            }

            case "mi/h": {
                switch (tU) {
                    case "m/s":
                        result = inserted * 0.447040013456d;
                        break;
                    case "ft/s":
                        result = inserted * 1.466667d;
                        break;
                    case "mi/h":
                        result = inserted;
                        break;
                    case "km/h":
                        result = inserted * 1.60934432d;
                        break;
                }
                break;
            }
            case "km/h": {
                switch (tU) {
                    case "m/s":
                        result = inserted * 0.2777778d;
                        break;
                    case "ft/s":
                        result = inserted * 0.9113444d;
                        break;
                    case "mi/h":
                        result = inserted * 0.6213712d;
                        break;
                    case "km/h":
                        result = inserted;
                        break;
                }
                break;
            }
        }
        return result;
    }
}