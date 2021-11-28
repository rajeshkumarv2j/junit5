package com.test.disable_fail;

import com.test.Calculator;
import com.test.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static final Calculator calculator = new Calculator();

    @Disabled("For now stop nested tests")
    @Nested
    static class CalTest{
        @Test
        void test_Add(){
            assertEquals(4, calculator.multiply(2,2));
        }

    }

    @Disabled("it is disable for now; we can look at it little later")
    @Test
    void test_Add(){
        assertEquals(4, calculator.multiply(2,2));
    }

    @Test
    void test_Add1(){
        assertEquals(4, calculator.multiply(2,2));
        fail("Just failed for now ; will test this after data release.");
    }

}