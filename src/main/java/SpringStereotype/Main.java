package SpringStereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Stereo.xml");
        Person p1 = (Person) context.getBean("Ob");
        System.out.println(p1);
        System.out.println(p1.getCity());

    }
}
