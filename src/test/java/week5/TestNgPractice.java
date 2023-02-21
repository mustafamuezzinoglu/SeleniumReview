package week5;

import org.testng.annotations.*;

public class TestNgPractice {

    @BeforeClass
    public void beforeClass() {
        System.out.println("This is before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This is after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is after method");
    }


    @Test
    public static void test1() {
        System.out.println("This is the test 1");
    }

    @Test
    public static void test2() {
        System.out.println("This is the test 2");
    }

}
