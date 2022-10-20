import java.util.Scanner;
public class A12_Armstrong {
    public static void main(String[] args) {
        int c = 0, a, temp;
        System.out.println("Enter a Number");
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        scanf.close();
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}