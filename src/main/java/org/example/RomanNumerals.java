package org.example;

public class RomanNumerals {

    public static String convert(int arabicNumber) {
        String character = "I";
        if (arabicNumber == 2){
            return character + character;
        }
        return character;
    }
}