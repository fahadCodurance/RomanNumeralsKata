package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {

    @Test
    void convert_1_to_I(){
        assertEquals("I",RomanNumerals.convert(1));
    }

    @Test
    void convert_2_to_II() {
        assertEquals("II", RomanNumerals.convert(2));
    }


}
