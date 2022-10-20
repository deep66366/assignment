public class A09_explicit {
    public static void main(String[] args) {
        double d = 100.123;
        float f = (float) d;
        System.out.println("Conversion of double to float: " + f);
        long l = (long) f;
        System.out.println("Conversion of float to long: " + l);
        int i = (int) l;
        System.out.println("Conversion of long to int: " + i);
        short s = (short) i;
        System.out.println("Conversion of int to short: " + s);
        byte b = (byte) s;
        System.out.println("Conversion of short to byte: " + b);
        char c = (char) b;
        System.out.println("Conversion of byte to ch: " + c);
    }
}
