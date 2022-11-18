import java.util.Scanner;

public class A37_nested_try_finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter Second number");
        int b = sc.nextInt();
        sc.close();
        int c;
        try {
            c = a / b;
        } catch (Exception e) {
            try {
                c = b / a;
            } catch (Exception e2) {
                System.out.println("Both numbers cann't be zero");
            }
        } finally {
            System.out.println("please try again");
        }
    }
}
