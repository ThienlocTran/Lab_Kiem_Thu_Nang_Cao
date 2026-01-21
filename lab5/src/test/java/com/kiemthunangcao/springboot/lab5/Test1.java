package com.kiemthunangcao.springboot.lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    @Test
    public void test1() {
        // Khởi tạo WebDriver cho Chrome
        WebDriver driver = new ChromeDriver();
        try {
            String url = "https://www.google.com";
            String title_web = "Google";

            // Mở trang Google
            driver.get(url);

            // Lấy title và so sánh
            String title = driver.getTitle();
            Assertions.assertNotNull(title);
            if(title.contentEquals(title_web)){
                System.out.println("Test Pass");
            } else {
                System.out.println("Test Fail");
            }
        } finally {
            // Đóng trình duyệt
            driver.quit();
        }
    }
}
