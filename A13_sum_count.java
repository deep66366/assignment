public class A13_sum_count {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 7 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("The Sum = " + sum);
        System.out.println("The Numbers of integers = " + count);
    }
}