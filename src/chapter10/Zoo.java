package chapter10;

public class Zoo {

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Here is your Dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here is your Cat food");
        }
    }

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal shasa = new Dog();
        shasa.makeSound();
        feed(shasa);

        shasa = new Cat();
        shasa.makeSound();
        ((Cat) shasa).scratch();
        feed(shasa);

    }

}
