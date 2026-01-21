package com.kiemthunangcao.springboot.lab5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        // khoi tao driver truoc khi chay ne
        wd = new ChromeDriver();
    }
    @Test
    public void testLogin() {
        // truy cap trang facebook
        wd.get("https://www.facebook.com/");

        WebElement email = wd.findElement(By.name("email"));
        email.sendKeys("tranthienloc21102005@gmail.com");

        // Khi điền user , máy cần 1 2 giây để nó load kịp , cho nên mk phải thêm thread sleep để trì hoãn, ko thì sẽ lỗi
        //WARNING: Unable to find version of CDP to use for 143.0.7499.193. You may need to include a dependency on a specific version of the CDP using something similar to `org.seleniumhq.selenium:selenium-devtools-v86:4.37.0` where the version ("v86") matches the version of the chromium-based browser you're using and the version number of the artifact is the same as Selenium's.
        //
        //org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"*[name='password']"}
        //  (Session info: chrome=143.0.7499.193)
        try{Thread.sleep(2000);}catch (Exception e) {
            throw new RuntimeException(e);
        }
        // ở by name phải đặt là pass thì tk facebook nó đặt pass, đặt password nó ko tìm được
        WebElement password = wd.findElement(By.name("pass"));
        password.sendKeys("<PASSWORD>");
        WebElement login = wd.findElement(By.name("login"));
        login.click();

        //kiem tra ket qua ay ma
        // Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
    @AfterClass
    public void tearDown() {
        // Đóng trình duyệt sau khi test xong
        if (wd != null) {
            wd.quit();
        }
    }
}
