package com.test.springboot.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJunit1 {
    @Test
    public void test1() {
        String str = "Hello World";
        assertEquals("Hello World", str);
    }
}
