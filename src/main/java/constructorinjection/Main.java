package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Constructor.xml");
        Person p = (Person) context.getBean("person");
        System.out.println(p);

        Addition a = (Addition) context.getBean("add");
        a.dosum();

    }
}