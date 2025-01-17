//Task description
//        Given the floating point numbers a, b, and h (where a < b and h > 0), output the values of a function f(x) to three decimal places on the half-interval [a, b) with the step h.
//        f(x) = x > 2 ? x : 2 * x + 1
//
//
//
//        Format of an input line is a b h.

import java.util.Scanner;

public class E82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        for (double x = a; x < b; x += h) {
            double fx = x > 2 ? x : 2 * x + 1;

            System.out.printf("%.3f ", fx);

        }

    }
}