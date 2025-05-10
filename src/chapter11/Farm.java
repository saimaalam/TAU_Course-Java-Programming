package chapter11;

public class Farm {
    public static void main(String[] args){
        Animal duck = new Duck();
        duck.eat();
        duck.makeSound();

        Duck whiteDuck = new Duck();
        whiteDuck.makeSound();

        Pig pig = new Pig();
        pig.makeSound();
        pig.eat();
    }
}
