import java.util.Scanner;

public class A15_prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();
        s.close();
        if (num != 2 && (num % 2 == 0) || (num < 2)) {
            System.out.println("Not a Prime Number");
        } else {
            for (int i = num / 2; i > 1; i--) {
                if (num % i == 0) {
                    System.out.println("Not a Prime Number");
                    return;
                }
            }
            System.out.println("Prime Number");
        }
    }
}
