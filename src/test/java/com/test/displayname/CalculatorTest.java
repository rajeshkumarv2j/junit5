package com.test.displayname;

import com.test.Calculator;
import com.test.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("This test class is to test the Calculation logic")
class CalculatorTest {

    private final Calculator calculator = new Calculator();


    @DisplayName("test multiply with minimum data")
    @Test
    void testMultiply(){
        assertEquals(4, calculator.multiply(2,2));
    }

    @DisplayName("test multiply with large data")
    @Test
    void testMultiply1(){
        assertEquals(400857796, calculator.multiply(22222222,22222222));
    }

}