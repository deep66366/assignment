class library {
    String bname;
    double bprice;

    library(String name, double price) {
        bname = name;
        bprice = price;
    }

    library(library lib) {
        bname = lib.bname;
        bprice = lib.bprice;
    }
}

public class A19_copyConstructor {
    public static void main(String[] args) {
        library a = new library("C++", 100);
        library b = new library(a);
        System.out.println("Book name : " + b.bname);
        System.out.println("Book price : " + b.bprice);
    }
}
