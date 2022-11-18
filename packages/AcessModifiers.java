package packages;

class AcessModifiers{
    private String a = "Private is accessible";
    protected String b = "Protected is accessible";
    String c = "Default is accessible";
    public String d = "Public is accessible";
    public static void main(String args[]){
        AcessModifiers obj = new AcessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}