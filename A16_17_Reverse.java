import java.util.Scanner;
// caculate Hcf of two numbers in java?

public class A16_17_Reverse {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int m = x.nextInt(),temp;
        x.close();
        int rev = 0, sum = 0;
        while (m > 0) {
            temp = m % 10;
            rev = rev * 10 + temp;
            sum = sum + temp;
            m = m / 0;
        }
        System.out.println("The Reverse of number=" + rev);
        System.out.println("The sum of digits=" + sum);
    }
}