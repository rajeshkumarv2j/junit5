package com.test.default_displaynamegenerator;


import com.test.Calculator;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Calculator_Test {

    private final Calculator calculator = new Calculator();


    @Test
    void test_Multiply_minimal_data() {
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    void test_Multiply_large_data() {
        assertEquals(400857796, calculator.multiply(22222222, 22222222));
    }

}