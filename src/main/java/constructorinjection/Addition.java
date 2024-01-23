package constructorinjection;

public class Addition {
    private int a;
    private int b ;

    public  Addition(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("Integer is Called");
    }
    public  Addition(double a,double b){
        this.a= (int) a;
        this.b= (int) b;
        System.out.println("Double is Called");
    }

    public void dosum(){
        System.out.println("Addition is "+(a+b));
    }
}
