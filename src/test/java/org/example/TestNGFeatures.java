package org.example;

import org.testng.annotations.*;

public class TestNGFeatures {

    // Global Pre-Conditions
    //pre Conditions
    //Test Steps
    //actual vs expected
    //Pass or Fail

    @BeforeSuite
    public void beforeSuite(){

        System.out.println("This is before suite method");

    }

    @BeforeTest
    public void BeforeTest(){

        System.out.println("This is before Test method");

    }

    @BeforeClass
    public void BeforeClass(){

        System.out.println("This is before Class method");

    }

    @BeforeMethod

    public void BeforeMethod(){

        System.out.println("This is before Method method");

    }

    @Test

    public void LogingTest(){

        System.out.println("This is Logon Test Method method");

    }

    @Test

    public void homePageTest(){

        System.out.println("This is homepage Test Method method");

    }

    @AfterMethod

    public void AfterMethod(){

        System.out.println("This is After Method method");

    }

    @AfterClass

    public void AfterClass(){

        System.out.println("This is After Class Method method");

    }

    @AfterTest

    public void AfterTest(){

        System.out.println("This is After Test Method method");

    }

    @AfterSuite

    public void afterSuite(){

        System.out.println("This is afterSuite Method method");

    }


}
