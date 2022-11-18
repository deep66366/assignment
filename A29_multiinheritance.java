interface A {
    void meth1();
}

interface B {
    void meth1();

    void meth2();
}

class MyClass implements A, B {
    public void meth1() {
        System.out.println("meth1() defined in MyClass");
    }

    public void meth2() {
        System.out.println("meth2() defined in MyClass");
    }
}

public class A29_multiinheritance {
    public static void main(String args[]) {
        MyClass obj = new MyClass();

        obj.meth1();
        obj.meth2();
    }
}