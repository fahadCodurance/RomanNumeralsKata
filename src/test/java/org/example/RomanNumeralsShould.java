package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @ParameterizedTest (name = "{0} into {1}")
    @CsvSource({"1,I","2,II","3,III"})
    void convert_arabic_number_to_roman_numeral(int input, String expectedOutput){
        assertEquals(expectedOutput,RomanNumerals.convert(input));
    }
}
