import packages.AcessModifiers;

public class A34_diffPkg_subclass extends AcessModifiers {
    public static void main(String args[]) {
        A34_diffPkg_subclass obj = new A34_diffPkg_subclass();
        // System.out.println(obj.a); not accessible
        System.out.println(obj.b);
        // System.out.println(obj.c); not accessible
        System.out.println(obj.d);
    }
}
