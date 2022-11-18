public class A27_dynamic_method {
    // Main method
    public static void main(String[] args) {
        // We are creating two objects here
        A obj1 = new A();
        B obj2 = new B();
        
        A ref; // reference variable of A
        ref = obj1;
        ref.display();
        ref = obj2;
        ref.display();
    }
}

class A {
    public void display() {
        System.out.println("Inside A's display method");
    }
}

class B extends A {
    public void display() {
        System.out.println("Inside B's display method");
    }
}