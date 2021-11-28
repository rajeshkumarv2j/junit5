package com.test.parameterized_inputsource;

import com.test.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest
    @ValueSource(ints = {1,2})
    void testMultiply(int i){
        assertEquals(i*i, calculator.multiply(i,i));
    }

    @ParameterizedTest(name = "CSV Source::Multiply with this data {0} * {1}")
    @CsvSource({"22222222,22222222","2,2"})
    void testMultiply1(int i, int j){
        assertEquals(i*j, calculator.multiply(i,j));
    }

    @ParameterizedTest(name = "Method Source::Multiply with this data {0} * {1}")
    @MethodSource("getData")
    void testMultiply2(int i, int j){
        assertEquals(i*j, calculator.multiply(i,j));
    }

    private static Stream<Arguments> getData(){
        return Stream.of(Arguments.of(2,2),Arguments.of(222222222,222222222));
    }
}