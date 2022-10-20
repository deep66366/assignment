import java.io.*;
public class A10_SimpleInterest {
    public static void main(String arg[]) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the values for P, R and T");
        double p = Double.parseDouble(r.readLine());
        double ra = Double.parseDouble(r.readLine());
        double t = Double.parseDouble(r.readLine());
        System.out.println("Simple Interest = "+((p * ra * t) / 100));
    }
}