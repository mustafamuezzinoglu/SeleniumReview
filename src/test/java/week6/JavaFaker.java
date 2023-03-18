package week6;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker {

    Faker faker = new Faker();

    @Test
    public void test1() {

        String name1 = faker.name().nameWithMiddle();
        String name2 = faker.name().username();
        String name3 = faker.address().country();
        String email = faker.internet().emailAddress();
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
        System.out.println("name3 = " + name3);
        System.out.println("email = " + email);
        int age = faker.number().numberBetween(18, 80);
        System.out.println("age = " + age);

        String actorName = faker.chuckNorris().fact();

        System.out.println(actorName);

    }
}
