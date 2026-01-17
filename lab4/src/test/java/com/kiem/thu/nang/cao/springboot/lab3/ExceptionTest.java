package com.kiem.thu.nang.cao.springboot.lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {

    Calculator cal = new Calculator();

    @Test
    void testArithmeticException() {
        // Mong đợi hàm divide ném ra ArithmeticException khi chia cho 0
        Assertions.assertThrows(ArithmeticException.class, () -> {
            cal.divide(10, 0);
        });
    }
// 2. Test NumberFormatException (Nhập chuỗi không phải số)
    @Test
    void testNumberFormat() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            cal.parseAndAdd("a", "10");
        });
    }

    @Test
    void testNullPointerException() {
        Assertions.assertThrows(NullPointerException.class ,() ->{
            cal.parseAndAdd(null, "10");
        });
    }

}
