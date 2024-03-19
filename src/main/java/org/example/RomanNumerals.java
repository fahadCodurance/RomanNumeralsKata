package org.example;

public class RomanNumerals {

    public static String convert(int arabicNumber) {
        String characterFor1 = "I";
        String characterFor5 = "V";
        String result = "";
        if (arabicNumber >= 5) {
            result += characterFor5;
            arabicNumber -= 5;
        }
        for (int i = 0; i < arabicNumber; i++) {
            result += characterFor1;
        }
        return result;
    }
}