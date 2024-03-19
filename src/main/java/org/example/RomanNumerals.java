package org.example;

public class RomanNumerals {

    public static String convert(int arabicNumber) {
        String character = "I";
        String result = "";
        if (arabicNumber == 5) {
            return "V";
        }
        for (int i = 0; i < arabicNumber; i++) {
            result += character;
        }
        return result;
    }
}