package springLifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Chinese {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Chinese() {
        super();
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "price=" + price +
                '}';
    }
    @PostConstruct
    public void Init(){
        System.out.println("Inside Init Method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Inside Destroying Method");
    }
}
