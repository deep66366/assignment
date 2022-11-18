class Encapsulation {
    private String name;
    Encapsulation(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
public class A30_encalsulation {
    public static void main(String[] args) {
        Encapsulation en = new Encapsulation("Deepak");
        System.out.println("Name is : " + en.getName());
    }
}