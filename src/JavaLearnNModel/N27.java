package JavaLearnNModel;

import java.util.Scanner;
public class N27 {
    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
//            if (a > max) {
////                max = a;
////            }
////            if (b > max) {
////                max = b;
////            }
////            if (c > max) {
////                max = c;
////            }

            if (a > b && a > c) {
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
