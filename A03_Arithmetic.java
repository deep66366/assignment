import java.io.*;

public class A03_Arithmetic {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter two numbers");
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader r = new BufferedReader(i);
        float a = Float.parseFloat(r.readLine());
        float b = Float.parseFloat(r.readLine());
        System.out.println("Addition is = "+(a+b));
        System.out.println("Subtration is = "+(a-b));
        System.out.println("Multiplication is = "+(a*b));
        System.out.println("Division is = "+(a/b));
        System.out.println("Modulas is = "+(a%b));
    }
}