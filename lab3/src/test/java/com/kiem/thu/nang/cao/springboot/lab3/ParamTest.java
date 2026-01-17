package com.kiem.thu.nang.cao.springboot.lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTest {
    Calculator cal = new Calculator();
    // CÁCH 1: Dùng @ValueSource (Chỉ truyền 1 tham số đầu vào)
    // Kiểm tra các số sau đây có phải là số dương hay không
    @ParameterizedTest
    @ValueSource(ints = {1,100,10,Integer.MAX_VALUE})
    void testIsPositiveTrue(int number) {
        Assertions.assertTrue(cal.isPositive(number),
        number + "nen la so duong");
    }

    // CÁCH 2: Dùng @CsvSource (Truyền tham số đầu vào và kết quả mong đợi)
    // Format: "input, expected_result"

    @ParameterizedTest
    @CsvSource({
            "10, true" // So duong se true
            ,"-5 , false" // so am se false
            ,"0, false" // so 0 cung false
            ,"-100,false "
    })
    void testIsPositiveCsv(int number, boolean expectedResult) {
        Assertions.assertEquals(expectedResult, cal.isPositive(number));
    }
}
