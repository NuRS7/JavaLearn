package JavaRush;

import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;


        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0 && n > max) {
                max = n;

            }

        }
        System.out.println(max);


    }
}
