package com.test.meta_annotations;

import com.test.Calculator;
import com.test.Person;
import com.test.meta_annotations.config.Fast;
import com.test.meta_annotations.config.FastTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("This is Calculator Test ")
@Fast
class CalculatorTest {

    private final Calculator calculator = new Calculator();
    private final Person person = new Person("Jane", "Doe");

    @FastTest
    void add() {
        assertEquals(3, calculator.add(1,2));
//        fail("test should have been aborted");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void print(int i) {
        calculator.print(i);
    }

    @Test
    void standardAssertions() {
        assertEquals(2, calculator.add(1, 1));
        assertEquals(4, calculator.multiply(2, 2),
                "The optional failure message is now the last parameter");
        assertTrue('a' < 'b', () -> "Assertion messages can be lazily evaluated -- "
                + "to avoid constructing complex messages unnecessarily.");
    }

    @Test
    void groupedAssertions() {
        // In a grouped assertion all assertions are executed, and all
        // failures will be reported together.
        assertAll("person",
                () -> assertEquals("Jane", person.getFirstName()),
                () -> assertEquals("Doe", person.getLastName())
        );
    }
}