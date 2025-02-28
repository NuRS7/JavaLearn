package E_Model;

import java.util.Scanner;

public class E70 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double max = a, min = a;

            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;

            }

            if (b<min) {
                min = b;
            }
            if (c < min) {
                min = c;

            }
            double sum = max + min;
            System.out.println(sum);
        }
    }
}
