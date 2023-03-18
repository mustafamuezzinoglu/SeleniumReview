package week5;

import org.testng.annotations.Test;

public class PropertiesReview {

    @Test
    public void test1() {

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.compiler"));

    }
}
