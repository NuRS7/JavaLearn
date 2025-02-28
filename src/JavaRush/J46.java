package JavaRush;

public class J46 {
    public static long cube(long arg) {
        arg = arg * arg * arg;
        return arg;
    }

    public static long ninthDegree(long a) {
        return cube(cube(a));
    }

    public static void main(String[] args) {
        cube(3);
        System.out.println(ninthDegree(3));

    }
}
