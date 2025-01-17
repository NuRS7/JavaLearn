//Given floating point numbers a and b and an integer n, where a < b, n > 1.
//Output values of a function f(x) to 3 decimal places on the segment [a, b] in n equidistant points.
//f(x) = 1 + 2 * sin(x).

import java.util.Scanner;

public class E86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int n = sc.nextInt();

        double step = (b - a) / (n - 1);
        for (int i = 0; i < n; i++) {
            double x = a + i * step;
            double fx = 1 + 2 * Math.sin(x);
            System.out.printf("%.3f ", fx);

        }



    }


}
