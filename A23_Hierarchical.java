class A {
    int a = 5;

    public void show() {
        System.out.println("In class A");
    }
}

class B extends A {
    public void show() {
        System.out.println("In class B and value of a is " + a);
    }
}

class C extends A {
    public void show() {
        System.out.println("In class C and value of a is " + a);
    }
}

public class A23_Hierarchical {
    public static void main(String args[]) {
        B obj1 = new B();
        C obj2 = new C();
        obj1.show();
        obj2.show();
    }
}