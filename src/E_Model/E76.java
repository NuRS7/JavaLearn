package E_Model;

import java.util.Scanner;

public class E76 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int d = sc.nextInt();
            int product = 0;
            if (d > 0) {
                for (int i = 0; i < 10; i++) {

                    product = d*i;
                    System.out.println(product);
                }
            }
        }
    }
}
