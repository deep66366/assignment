class Shapes {
    double area;
    Shapes(float a) {
        area = a * a;
    }
    Shapes(float l, float b) {
        area = l * b;
    }
    Shapes(float h, double b) {
        area = (h * b) / 2;
    }
    Shapes(float l, float b, float h) {
        area = l * b * h;
    }
}
public class A18_Constructor_overloading {
    public static void main(String[] args) {
        Shapes square = new Shapes(5);
        Shapes rectangle = new Shapes(5.5f, 6);
        Shapes triangle = new Shapes(5.2f, 4.5);
        Shapes cuboid = new Shapes(5.2f, 4.5f, 6);
        System.out.println("Area of square is : " + square.area);
        System.out.println("Area of rectangle is : " + rectangle.area);
        System.out.println("Area of triangle is : " + triangle.area);
        System.out.println("Area of cuboid is : " + cuboid.area);
    }
}