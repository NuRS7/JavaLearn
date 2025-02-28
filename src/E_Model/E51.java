package E_Model;

import java.util.Scanner;

public class E51 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                System.out.println("True");

            } else {
                System.out.println("False");
            }

        }
    }
}
