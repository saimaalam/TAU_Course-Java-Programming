package chapter10;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
    public void fetch(){
        System.out.println("I'm a dog. Fetch is fun!");
    }
}
