package packages;

public class A32_samePkg {
    public static void main(String args[]) {
        AcessModifiers obj = new AcessModifiers();
        // System.out.println(obj.a); not accessible
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
