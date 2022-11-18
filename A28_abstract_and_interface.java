abstract class Animal {
    abstract void makeSound();
}

class Cat extends Animal {

    void makeSound() {
        System.out.println("Meow!");
    }
}

interface CanClimb {
    void climb();
}

class Spider extends Animal implements CanClimb {

    void makeSound() {
        System.out.println("Hiss!");
    }

    public void climb() {
        System.out.println("The spider climbs up the wall.");
    }
}

public class A28_abstract_and_interface {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        Spider spider = new Spider();
        spider.makeSound();
        spider.climb();
    }
}