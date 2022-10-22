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
    Bike() {
        super(50);
        System.out.println("Bike is created");
    }
}

public class A24_this_and_super {
    public static void main(String args[]) {
        new A24_this_and_super();
    }
}
