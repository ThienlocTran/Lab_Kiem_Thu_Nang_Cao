package com.kiem.thu.nang.cao.springboot.lab3;

import org.junit.platform.suite.api.SelectClasses;

import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses({DemoTwo.class, DemoOne.class}) // Chọn chạy tất cả test trong package
public class SuiteTest {
}
