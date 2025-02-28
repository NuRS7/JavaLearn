package E_Model;

import java.util.Scanner;

public class E21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // do not change the code above

            // change this code
            long a = sc.nextInt();
            long b = sc.nextInt();

            double avg = (a + b) / 2.0;

            // do not change the next line
            System.out.printf("%.1f", avg);
    }
}
}
