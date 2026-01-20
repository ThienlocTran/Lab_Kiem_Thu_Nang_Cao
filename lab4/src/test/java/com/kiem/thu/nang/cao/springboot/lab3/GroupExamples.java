package com.kiem.thu.nang.cao.springboot.lab3;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class GroupExamples {
    @Test
    @Tag("Regression") // Gán nhãn Regression
    void testCaseOne() {
        System.out.println("Im in testCaseOne And in Regression Group");
    }

    @Test
    @Tag("Regression")
    void testCaseTwo() {
        System.out.println("Im in testCaseTwo And in Regression Group");
    }

    @Test
    @Tag("SmokeTest") // Gán nhãn SmokeTest
    void testCaseThree(){
        System.out.println("Im in testCaseThree And in Smoke Test Group");
    }

    @Test
    @Tag("Regression")
    void testCaseFour() {
        System.out.println("Im in testCaseFour And in Regression Group");
    }
}
