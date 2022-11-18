import packages.AcessModifiers;

public class A35_diffpkg {
    public static void main(String args[]){
        AcessModifiers obj = new AcessModifiers();
        // System.out.println(obj.a); not accessible
        // System.out.println(obj.b); not accessible
        // System.out.println(obj.c); not accessible
        System.out.println(obj.d);
    }
}
