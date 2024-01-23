package springLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class GarlicBread implements InitializingBean, DisposableBean {
    private int price;

    public GarlicBread(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GarlicBread{" +
                "price=" + price +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside Initializing Method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying method");
    }
}
