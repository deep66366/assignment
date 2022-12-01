class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class A38_userdefineecp {

    static void validate(int age) throws Exception {
        if (age < 18)
            throw new MyException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String args[]) {
        try {
            validate(13);
        } catch (Exception m) {
            System.out.println("Exception occured: " + m);
        }

        System.out.println("rest of the code...");
    }
}