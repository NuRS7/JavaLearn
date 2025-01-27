package JavaLearnNModel;

import java.util.Scanner;

public class N69 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long s = sc.nextLong();

            while (s >= 10) {
                s /= 10;
            }
            System.out.println(s);

        }}}