//Task description
//        Given the integers a and b, if a < b, exchange their values one for the other, and output a and then b.
//
//
//
//        Format of an input line is a b.


import java.util.Scanner;
public class E68 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < b) {
                int other_n = a;
                a = b;
                b = other_n;

            }
            System.out.printf("%d %d", a, b);
        }
    }
}
