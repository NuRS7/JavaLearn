package E_Model;

import java.util.Scanner;

public class E53 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            double avg = 0.0;

            avg = (a + b) / 2.0;

            System.out.printf("%.1f", avg);


        }
    }
}
