import java.util.Scanner;

public class A14_fibonnaci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int no = s.nextInt();
        // new fibo(no);
        s.close();
        // With constants
        double a = 1.6180339887;
        double b = 2.2360679775;
        for (int i = 0; i < no; i++) {
            System.out.println(Math.round(Math.pow(a, i) / b));
        }
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