package com.kiem.thu.nang.cao.springboot.lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VatCalculatorTest {

    @Test
    void getVatOnAmount() {
        VatCalculator vatCalculator = new VatCalculator();
        double expected = 10;
        Assertions.assertEquals(expected,vatCalculator.getVatOnAmount(100));
        Assertions.assertNotEquals(expected,vatCalculator.getVatOnAmount(120    ));
    }
}