package chapter10;

public class Market {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.removeSeeds();
        apple.makeJuice();

        Fruit greenApple= new Apple();
        ((Apple)greenApple).removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruit ripeBanana= new Banana();
        ((Banana)ripeBanana).peel();

        Fruit orange = new Fruit(45.35);

        orange.makeJuice();
        serveJuice(orange);
        serveJuice(apple);
        serveJuice(banana);
        serveJuice(greenApple);
        serveJuice(greenApple);

    }
    public static void serveJuice(Fruit fruit){
        System.out.print("Here is the juice");
        fruit.makeJuice();
    }
}
