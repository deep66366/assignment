class Vehicle {
    int speed;

    Vehicle() {
        System.out.println("Vehicle is created");
    }

    Vehicle(int speed) {
        this();
        this.speed = speed;
        System.out.println("Vehicle speed = " + speed);
    }
}

class Bike extends Vehicle {
    Bike(int a) {
        super(50);
        this.speed = a;
        System.out.println("Bike is created");
        System.out.println("Now Vehicle speed = " + speed);
    }
}

public class A24_this_and_super {
    public static void main(String args[]) {
        new Bike(40);
    }
}