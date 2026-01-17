package com.test.springboot.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(5,calculator.add(2,3));
    }

    @Test
    void sub() {
        assertEquals(-1,calculator.sub(2,3));
    }

    @Test
    void mul() {
        assertEquals(6,calculator.mul(2,3));
    }

    @Test
    void div() {
        assertEquals(0,calculator.div(2,0));
    }

    @Test
    public void testCondition(){
        assertTrue(calculator.div(2,2)==1);
        assertFalse(calculator.add(2,0)==1);
    }
}