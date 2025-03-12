package Basics;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(1, 3));
        System.out.println(sum(1.3, 2.3));
        System.out.println(sum(1, 3, 5));
    }

    static int sum(int x, int y) {
        return x + y;
    }
    static double sum(double x, double y) {
        return x + y;
    }
    static int sum(int x, int y, int z) {
        return x + y + z;
    }

}
//В программе мы можем использовать методы с одним и тем же именем, но с разными типами и/или количеством параметров.
// Такой механизм называется перегрузкой методов (method overloading)