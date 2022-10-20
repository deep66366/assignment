import java.util.Scanner;

public class A07_Greater_of_three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three values");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        s.close();
        if (a > b && a > c) {
            System.out.println(a + " is Greater");
        } else if (b > c) {
            System.out.println(b + " is Greater");
        } else {
            System.out.println(c + " is Greater");
        }
    }
}