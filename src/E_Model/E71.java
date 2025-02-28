package E_Model;//Given the integers a, b, c, and d, output max(min(a, b), min(c, d)).
//without Math

import java.util.Scanner;

public class E71 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int min = a;
            if (b <= min) {
                min = b;
            }
            int minimum = c;
            if (d <= min) {
                minimum = d;

            }
            int max = min;
            if (minimum > max) {
                max = minimum;
            }
            System.out.println(max);




        }
    }
}
