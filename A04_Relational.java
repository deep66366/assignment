import java.util.Scanner;

public class A04_Relational {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("A is " + a + " and B is " + b);
        System.out.println("A and B are equal :- " + (a == b));
        System.out.println("A and B are not equal :- " + (a != b));
        System.out.println("A is Greater :- " + (a > b));
        System.out.println("B is Greater :- " + (a < b));
        System.out.println("A is Greater or Equal :- " + (a >= b));
        System.out.println("B is Greater or Equal :- " + (a <= b));
        s.close();
    }
}
