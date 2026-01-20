package com.kiem.thu.nang.cao.springboot.lab3;


import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(GroupExamples.class)
@IncludeTags("Regression")          // Chỉ chạy các test có tag là Regression
public class RunRegressionSuite {

}