package com.test.lifecyclemethods;

import com.test.Calculator;
import com.test.Person;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    static void setupAll() {
        System.out.println("setupAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("setup");
    }

    @Test
    void testAdd(){
        assertEquals(4, calculator.multiply(2,2));
    }

    @AfterEach
    void tearDown() {
        System.out.println("teardown");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tearDownAll");
    }


}