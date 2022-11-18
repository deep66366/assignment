public class A36_Exception_handling {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 100/a; //zero Divide Exception
        } catch (Exception e) {
           e.printStackTrace();
        }
        System.out.println(a);
    }
}