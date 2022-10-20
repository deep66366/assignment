import java.util.Scanner;

public class A14_fibonnaci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        new fibo(s.nextInt());
        s.close();
    }
}

class fibo {
    fibo(int number) {
        int a = 0;
        int b = 1;
        int c = 1;
        System.out.println("0\n1");
        for (int i = 2; i < number; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(b);
        }
    }
}