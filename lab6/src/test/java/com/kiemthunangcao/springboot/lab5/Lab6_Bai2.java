package com.kiemthunangcao.springboot.lab5;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.io.IOException;

public class Lab6_Bai2 {
    @Test
    public void testLoginAndExportExcel() throws IOException {
        WebDriver driver = new ChromeDriver();
        String result; // Biến lưu kết quả

        try {
            driver.get("https://www.facebook.com/");

            // Thực hiện đăng nhập (Code cũ)
            driver.findElement(By.id("email")).sendKeys("tranthienloc21102005@gmail.com");
            driver.findElement(By.name("pass")).sendKeys("pass_sai_ne"); // Cố tình nhập sai
            driver.findElement(By.name("login")).click();

            Thread.sleep(3000); // Chờ load

            // Kiểm tra kết quả: Nếu tiêu đề trang vẫn chứa "Facebook" hoặc URL không đổi thì coi như Login Fail
            String pageTitle = driver.getTitle();

            // Giả lập logic kiểm tra
            Assertions.assertNotNull(pageTitle);
            if (pageTitle.contains("Log in")) {
                result = "FAIL (Dung nhu mong doi vi nhap sai pass)";
            } else {
                result = "PASS";
            }

            System.out.println("Kết quả test: " + result);

        } catch (Exception e) {
            result = "ERROR: " + e.getMessage();
        } finally {
            driver.quit();
        }

        // --- PHẦN GHI RA EXCEL ---
        writeToExcel(result);
    }

    // Hàm riêng để xử lý việc ghi file Excel
    public void writeToExcel(String testResult) throws IOException {
        // 1. Tạo workbook (file excel ảo)
        Workbook workbook = new XSSFWorkbook();

        // 2. Tạo sheet (trang tính)
        Sheet sheet = workbook.createSheet("KetQuaKiemThu");

        // 3. Tạo dòng đầu tiên (Header) - Dòng 0
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Tên Test Case");
        headerRow.createCell(1).setCellValue("Kết quả");

        // 4. Tạo dòng dữ liệu - Dòng 1
        Row dataRow = sheet.createRow(1);
        dataRow.createCell(0).setCellValue("Login Facebook"); // Cột tên
        dataRow.createCell(1).setCellValue(testResult);       // Cột kết quả

        // 5. Lưu ra file vật lý
        try (FileOutputStream fileOut = new FileOutputStream("KetQuaLab6.xlsx")) {
            workbook.write(fileOut);
            System.out.println("Đã xuất file Excel thành công: KetQuaLab6.xlsx");
        }
        workbook.close();
    }
}
