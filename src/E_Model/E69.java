package E_Model;//
//Given the integers h and m, where h is the number of hours and m is minutes, output whether h and m are valid (0 <= h < 24 and 0 <= m < 60).
//
//
//
//        Format of an input line is h m.

import java.util.Scanner;

public class E69 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            if((0<= h && h <= 23) && (0<= m && m <= 59)) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
        }
}
