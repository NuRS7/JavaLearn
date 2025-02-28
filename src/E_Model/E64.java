package E_Model;

import java.util.Scanner;
public class E64 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double A = x1 * x1 + y1 * y1;
            double B = x2 * x2 + y2 * y2;
            if (A == B) {

                System.out.println(0);

            } else if (A<B) {
                System.out.println(1);

            } else {
                System.out.println(-1);
            }
        }
    }
}
