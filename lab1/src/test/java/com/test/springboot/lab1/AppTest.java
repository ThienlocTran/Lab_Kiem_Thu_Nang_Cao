package com.test.springboot.lab1;

import org.junit.jupiter.api.Test;
// 1. Chỉ giữ lại import này của JUnit 5
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AppTest { // 2. JUnit 5 không cần "public" ở class và method (mặc định là package-private)

    App app = new App();
    @Test
    void testIsEvenNumber2() {
        // 3. Gọi trực tiếp hàm static, không cần "new App()"
        boolean result = app.isEventNumber(2);
        assertTrue(result, "Số 2 phải là số chẵn (True)");
    }

    @Test
    void testIsOddNumber() {
        // 4. Test số 3 (số lẻ)
        boolean result = app.isEventNumber(3);

        // LƯU Ý QUAN TRỌNG:
        // Nếu bạn muốn test PASS (Code đúng logic): Dùng assertFalse
        assertFalse(result, "Số 3 không phải là số chẵn (False)");


    }
}