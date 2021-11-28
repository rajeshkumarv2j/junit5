package com.test.displaynamegenerator_nestedtestclass;

import com.test.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    class Calculator_Test_Multiply {
        @Test
        void test_Multiply_with_minimal_data(){
            assertEquals(4, calculator.multiply(2,2));
        }

        @DisplayName("this Display Name is take precedence; test multiply with large data")
        @Test
        void test_Multiply_with_large_data(){
            assertEquals(400857796, calculator.multiply(22222222,22222222));
        }
    }

    @Nested
    @IndicativeSentencesGeneration(separator = " --> ", generator = DisplayNameGenerator.ReplaceUnderscores.class)
    class Calculator_Test_Multiply1 {
        @Test
        void test_Multiply_with_minimal_data(){
            assertEquals(4, calculator.multiply(2,2));
        }

        @DisplayName("this Display Name is take precedence; test multiply with large data")
        @Test
        void test_Multiply_with_large_data(){
            assertEquals(400857796, calculator.multiply(22222222,22222222));
        }
    }

}