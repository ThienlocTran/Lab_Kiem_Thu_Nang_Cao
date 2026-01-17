package com.kiem.thu.nang.cao.springboot.lab3;

import org.junit.jupiter.api.*;

public class JunitLifecycleTest {
    private Calculator calculator;

// @BeforeAll: Chạy 1 lần duy nhất trước TẤT CẢ các test case.
    // Phải là static method. Thường dùng để khởi tạo Resource nặng (DB, Network).
    @BeforeAll
    public static void setupAll() {
        System.out.println("--- @BeforeAll: Khởi động cấu hình chung ---");
    }

    @BeforeEach
    public void setup(){
        System.out.println("@BeforeEach: Khởi tạo đối tượng Calculator mới");
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        System.out.println("Thuc hien test add");
        Assertions.assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testDivide(){
        System.out.println("Thuc hien test divide");
        Assertions.assertEquals(2, calculator.divide(4, 2));
    }

    // @AfterEach: Chạy sau MỖI phương thức @Test.
    // Dùng để dọn dẹp dữ liệu tạm thời.
    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach: Dọn dẹp sau mỗi bài test");
        calculator = null;
    }

    // @AfterAll: Chạy 1 lần duy nhất sau khi TẤT CẢ test case hoàn thành.
    // Phải là static method. Dùng để đóng kết nối.
    @AfterAll
    static void  tearDownAll() {
        System.out.println("Dong het tat ca cac test");
    }


}

