package com.kiem.thu.nang.cao.springboot.lab3;

public class Calculator {

    // Phương thức cộng cơ bản
    public int add(int a, int b) {
        return a + b;
    }

    // Phương thức chia (sẽ dùng để test ngoại lệ ArithmeticException)
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return (double) a / b;
    }

    // Phương thức xử lý chuỗi số (dùng để test NumberFormat và NullPointer)
    public int parseAndAdd(String a, String b) {
        if (a == null || b == null) {
            throw new NullPointerException("Tham số không được null");
        }
        return Integer.parseInt(a) + Integer.parseInt(b); // Có thể ném NumberFormatException
    }

    // Phương thức kiểm tra số dương
    public boolean isPositive(int number) {
        return number > 0;
    }
}