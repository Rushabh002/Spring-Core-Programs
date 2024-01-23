package springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Refconfig.xml");
        A A1 = (A) context.getBean("aref");
        System.out.println(A1.getX());
        System.out.println(A1.getObj().getY());
        System.out.println(A1);
    }
}
