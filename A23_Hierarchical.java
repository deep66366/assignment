class A {
    int a = 5;
}

class B extends A {
    public void show() {
        System.out.println("In class B value of a is " + a);
    }
}

class C extends A {
    public void show() {
        System.out.println("In class C value of a is " + a);
    }
}

public class A23_Hierarchical {
    public static void main(String args[]) {
        B obj1 = new B();
        C obj2 = new C();
        obj1.show();
        obj2.show();
        System.out.println("Assessing member of A from B : " + obj1.a);
        System.out.println("Assessing member of A from C : " + obj2.a);
    }
}