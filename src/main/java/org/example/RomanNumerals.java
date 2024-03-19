package org.example;

import java.util.ArrayList;

public class RomanNumerals {

    public static String convert(int arabicNumber) {
        String[] romanNumerals = {"X", "V", "I"};
        Integer[] arabicValues = {10, 5, 1};

        String result = "";
        if (arabicNumber == arabicValues[0]){
            result +=  romanNumerals[0];
            arabicNumber -= arabicValues[0];
        }
        if (arabicNumber >= arabicValues[1]) {
            result += romanNumerals[1];
            arabicNumber -= arabicValues[1];
        }

        while (arabicNumber > 0){
            result += romanNumerals[2];
            arabicNumber -= arabicValues[2];
        }
        return result;
    }
}