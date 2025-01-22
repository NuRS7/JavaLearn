package JavaLearnNModel;

import java.util.Scanner;

public class N31 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = 0;
            if (a > b && a>c) {
                max = a;
            } else if (b > c) {
                max = b;
            } else {
                max = c;
            }
            System.out.println(max);

        }
    }
}
