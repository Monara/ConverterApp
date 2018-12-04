package com.example.asus.converterapp;

public class LengthUnit {
    private MetricConverter metricConverter;

    public double convert( double input,String originalUnit, String newUnit) {
        metricConverter = new MetricConverter();
        double num1 = input;
        double num2 = 0.0;

        String original = originalUnit.toLowerCase();
        String newU = newUnit.toLowerCase();

        switch(original)
        {

            case "feet":
            {
                switch(newU)
                {
                    case "inches":

                        num2 = num1*12.0;
                        break;
                    case "feet":
                        num2 = num1;
                        break;
                    case "yards":

                        num2 = num1/3.0d;
                        break;
                    case "miles":

                        num2 = num1/5280.0d;
                        break;
                    case "millimeters":

                        num2 = num1*304.8d;
                        break;
                    case "centimeters":

                        num2 = num1*30.48d;
                        break;
                    case "meters":

                        num2 = num1*0.3048d;
                        break;
                    case "kilometers":

                        num2 = num1*0.0003048d;
                        break;
                }
                break;
            }
            case "yard":
            {
                switch(newU) {
                    case "inches":

                        num2 = num1 * 36.0d;
                        break;
                    case "feet":

                        num2 = num1 * 3.0d;
                        break;
                    case "yards":
                        num2 = num1;
                        break;
                    case "miles":

                        num2 = num1 / 1760.0d;
                        break;
                    case "millimeters":

                        num2 = num1 * 914.4d;
                        break;
                    case "centimeters":

                        num2 = num1*91.44d;
                        break;
                    case "meters":
                        num2 = num1*0.9144d;
                        break;
                    case "kilometers":

                        num2 = num1/1093.61d;
                        break;
                }
                break;
            }
            case "mile":
            {
                switch(newU)
                {
                    case "inches":

                        num2 = num1*6330.0d;
                        break;
                    case "feet":

                        num2 = num1*5280.0d;
                        break;
                    case "yards":

                        num2 = num1*1760.0d;
                        break;
                    case "miles":
                        num2 = num1;
                        break;
                    case "millimeters":

                        num2 = num1*1609340.0d;
                        break;
                    case "centimeters":

                        num2 = num1*160934.0d;
                        break;
                    case "meters":

                        num2 = num1*1609.34d;
                        break;
                    case "kilometers":

                        num2 = num1*1.60934d;
                        break;
                }
                break;
            }
            case "millimetre":
            {
                switch(newU)
                {
                    case "inches":
                        num2 = num1*25.4d;
                        break;
                    case "feet":
                        num2 = num1/304.8d;
                        break;
                    case "yards":
                        num2 = num1/914.4d;
                        break;
                    case "miles":
                        num2 = num1/1609000.0d;
                        break;
                    case "millimeters":
                        num2 = num1;
                        break;
                    case "centimeters":
                        num2 = metricConverter.metricConvert(num1, "milli", "centi");
                        break;
                    case "meters":
                        num2 = metricConverter.metricConvert(num1, "milli", "unit");
                        break;
                    case "kilometers":
                        num2 = metricConverter.metricConvert(num1, "milli", "kilo");
                        break;
                }
                break;
            }

            case "centimetre":
            {
                switch(newU)
                {
                    case "inches":
                        num2 = num1 / 2.54d;
                        break;
                    case "feet":
                        num2 = num1 / 30.48d;
                        break;
                    case "yard":
                        num2 = num1 / 91.44;
                        break;
                    case "miles":
                        num2 = num1/160934.0d;
                        break;
                    case "millimetre":
                        num2 = metricConverter.metricConvert(num1, "centi", "milli");
                        break;
                    case "centimeters":
                        num2 = num1;
                        break;
                    case "meters":
                        num2 = metricConverter.metricConvert(num1, "centi", "unit");
                        break;
                    case "kilometers":
                        num2 = metricConverter.metricConvert(num1, "centi", "kilo");
                        break;
                }
                break;
            }
            case "meter":
            {
                switch(newU) {
                    case "inches":
                        num2 = num1 * 39.3701d;
                        break;
                    case "feet":
                        num2 = num1 * 3.28084d;
                        break;
                    case "yards":
                        num2 = num1*1.09361d;
                        break;
                    case "miles":
                        num2 = num1/1609.34d;
                        break;
                    case "millimeters":
                        num2 = metricConverter.metricConvert(num1, "unit", "milli");
                        break;
                    case "centimeters":
                        num2 = metricConverter.metricConvert(num1, "unit", "centi");
                        break;
                    case "meters":
                        num2 = num1;
                        break;
                    case "kilometers":
                        num2 = metricConverter.metricConvert(num1, "unit", "kilo");
                        break;
                }
                break;
            }
            case "kilometre":
            {
                switch(newU)
                {
                    case "feet":
                        num2 = num1*3280.84d;
                        break;
                    case "yard":
                        num2 = num1*1093.61d;
                        break;
                    case "mile":
                        num2 = num1/1.60934d;
                        break;
                    case "millimetre":
                        num2 = metricConverter.metricConvert(num1, "kilo", "milli");
                        break;
                    case "centimetre":
                        num2 = metricConverter.metricConvert(num1, "kilo", "centi");
                        break;
                    case "meter":
                        num2 = metricConverter.metricConvert(num1, "kilo", "unit");
                        break;
                    case "kilometre":
                        num2 = num1;
                        break;
                }
                break;
            }
        }

        return num2;
    }

}
