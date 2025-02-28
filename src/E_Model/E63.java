package E_Model;

import java.util.Scanner;

public class E63 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            if (a >= 0) {
                System.out.printf("%.3f", a * a);
            }
            else {
                System.out.printf("%.3f", a * a * a * a);
            }
        }
    }
}
