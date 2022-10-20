import java.util.Scanner;
public class A05_logical_leapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = s.nextInt();
        s.close();
        if ((year % 400 == 0) || (year % 4 == 0 && !(year % 100 == 0)))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is normal year.");
    }
}