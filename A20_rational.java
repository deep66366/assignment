import java.util.Scanner;

public class A20_rational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator and Denomentor of First Number");
        int p1 = sc.nextInt();
        int q1 = sc.nextInt();
        System.out.println("Enter Numerator and Denomentor of Second Number");
        int p2 = sc.nextInt();
        int q2 = sc.nextInt();
        sc.close();
        int p3 = p1 * q2 + p2 * q1;
        int q3 = q1 * q2;
        int q = hcf(p3, q3);
        p3 = p3 / q;
        q3 = q3 / q;
        System.out.println("Answer is : " + p3 + ((q3 == 1) ? ("") : ("/" + q3)));
    }

    static int hcf(int a, int b) {
        int rem = b % a;
        while (rem != 0) {
            int s = rem;
            rem = a % rem;
            a = s;
        }
        return a;
    }
}
