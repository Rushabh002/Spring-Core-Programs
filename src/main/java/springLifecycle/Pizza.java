package springLifecycle;

public class Pizza {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("Setting Price");
        this.price = price;
    }

    public Pizza() {
        super();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "price=" + price +
                '}';
    }
    public void init(){
        System.out.println("Inside Init Method");
    }
    public void destroy(){
        System.out.println("Inside Destroy Method");
    }
}
