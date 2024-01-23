package SpringAutoWire;

import com.springcore.SpringcoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =new ClassPathXmlApplicationContext("Autoconfig.xml");
        Emp e = (Emp) context.getBean("e1");
        System.out.println(e);
    }
}
