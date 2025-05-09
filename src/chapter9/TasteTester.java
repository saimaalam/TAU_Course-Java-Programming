package chapter9;

public class TasteTester {
    public static void main(String[] args){
        Cake cake = new Cake("Black forest");
        cake.setPrice(15.50);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(37.50);
        birthdayCake.setCandles("5");
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());
        System.out.println("Candles : " + birthdayCake.getCandles());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("Tiramisu");
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());

    }
}
