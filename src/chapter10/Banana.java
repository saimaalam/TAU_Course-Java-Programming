package chapter10;

public class Banana extends Fruit{
    public Banana(){
        super(102);
    }
    public void peel(){
        System.out.println("Banana is pilled");
    }
    @Override
    public void makeJuice(){
        System.out.println("\nBanana shake is made");
    }
}
