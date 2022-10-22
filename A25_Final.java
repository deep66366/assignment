public class A25_Final {
    public static void main(String[] args) {
        final int num = 10;
        // num = 30; // This statement will give an error
        // Because we cannot assign a value to final variable num
        System.out.println(num);
    }
}