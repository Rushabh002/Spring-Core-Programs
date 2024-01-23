package SpringStandalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("Standalone.xml");
        Person p = (Person) context.getBean("Person");
        System.out.println(p);

    }
}
