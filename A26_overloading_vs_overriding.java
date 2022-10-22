class Shapes {
    float area;

    void area(int a) {
        area = a * a; // This is area method with one parameter
    }

    void area(int l, int b) {
        area = l * b; // This is overloaded area method with two parameter
    }
}

class Triangle extends Shapes {
    void area(int h, int b) {
        area = (h * b) / 2; // This is overrided area method with two parameter
    }
}

public class A26_overloading_vs_overriding {
    public static void main(String[] args) {
        Shapes squ = new Shapes();
        Shapes rec = new Shapes();
        Triangle tri = new Triangle();
        squ.area(3);
        rec.area(3, 5);
        tri.area(3, 5);
    }
}
