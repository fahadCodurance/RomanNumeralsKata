package org.example;

public class RomanNumerals {

    public static String convert(int arabicNumber) {
        String character = "I";
        String result = "";
        if (arabicNumber >= 5) {
            result += "V";
            arabicNumber -= 5;
        }
        for (int i = 0; i < arabicNumber; i++) {
            result += character;
        }
        return result;
    }
}