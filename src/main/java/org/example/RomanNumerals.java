package org.example;

public class RomanNumerals {

    public static String convert(int arabicNumber) {
        String character = "I";
        String result = character;
        if (arabicNumber == 5) {
            return "V";
        }
        if (arabicNumber >= 3){
            result += character;
        }
        if (arabicNumber >= 2){
            result += character;
        }
        return result;
    }
}