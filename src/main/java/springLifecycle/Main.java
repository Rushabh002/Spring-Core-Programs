package springLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("springcycle.xml");

        /*Pizza p = (Pizza) context.getBean("p1");
        System.out.println(p);*/

        context.registerShutdownHook();

        /*GarlicBread g = (GarlicBread) context.getBean("g1");
        System.out.println(g);*/

        Chinese c = (Chinese) context.getBean("c1");
        System.out.println(c);
    }
}
