package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal shasa = new Dog();
        shasa.makeSound();

        shasa = new Cat();
        shasa.makeSound();
        ((Cat)shasa).scratch();

    }
}
