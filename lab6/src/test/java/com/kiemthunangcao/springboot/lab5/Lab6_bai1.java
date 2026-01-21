package com.kiemthunangcao.springboot.lab5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab6_bai1 {
    @Test
    public void testLoginLocators() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // 1. Dùng ID (Facebook có id="email")
        WebElement txtEmail = driver.findElement(By.id("email"));
        txtEmail.sendKeys("tranthienloc21102005@gmail.com");

        // 2. Dùng Name (Facebook có name="pass")
        WebElement txtPass = driver.findElement(By.name("pass"));
        txtPass.sendKeys("<<PASSWORD>>");

        // 3. Dùng CSS Selector (Tìm nút button có name là login)
        // Cú pháp: tagname[attribute='value']
        WebElement btnLogin = driver.findElement(By.cssSelector("button[name='login']"));
        btnLogin.click();

        // Đóng trình duyệt (để tạm code này hoặc dùng try/finally như bài trước)
        // driver.quit();
    }
}
