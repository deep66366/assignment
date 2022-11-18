package packages;

public class A33_samePkg_subClass extends AcessModifiers {
    public static void main(String args[]){
        A33_samePkg_subClass obj = new A33_samePkg_subClass();
        // System.out.println(obj.a); not accessible
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}