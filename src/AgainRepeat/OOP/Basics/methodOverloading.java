package AgainRepeat.OOP.Basics;

public class methodOverloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        double d = 10.1;
        double e = 10.1;


        System.out.println(sum(a, b));
        System.out.println(sum(a,b,c));
        System.out.println(sum(c, d));
        System.out.println(sum(d,e));
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static double sum(double a, double b) {
        return a + b;
    }
}
