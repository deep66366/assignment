class A {
    public void a() {
        System.out.println("a method of Class A");
    }
}

class B extends A {
    public void b() {
        System.out.println("b method of Class B");
    }
}

class C extends B {
    public void c() {
        System.out.println("c method of Class C");
    }
}

public class A22_MuliLevel {
    public static void main(String args[]) {
        C obj = new C();
        obj.a();
        obj.b();
        obj.c();
    }

}