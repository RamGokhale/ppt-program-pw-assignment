abstract class Animal {

    abstract void makeSound();
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

class Cow extends Animal {

    @Override
    void makeSound() {
        System.out.println("Moo!");
    }
}

public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

        Animal cow = new Cow();
        cow.makeSound();
    }
}
