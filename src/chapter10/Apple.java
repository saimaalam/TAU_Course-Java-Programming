package chapter10;

public class Apple extends Fruit {
    public Apple() {
        super(70.25);
    }

    public void removeSeeds(){
        System.out.println("Apple seeds are removed");
    }
    @Override
    public void makeJuice() {
        System.out.println("\nApple Juice is made");
    }


}
