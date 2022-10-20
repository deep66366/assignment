import java.util.Scanner;

public class A11_factorial {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanf.nextInt();
        scanf.close();
        int fact = 1;
        for (int i = num; i > 1; i--)
            fact = fact * i;
        System.out.println("Factorial = " + fact);
    }
}