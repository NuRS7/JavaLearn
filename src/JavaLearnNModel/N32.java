package JavaLearnNModel;

import java.util.Scanner;

public class N32 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int input = sc.nextInt();
            check: if (input % 4 == 0) {
                if (input % 100 == 0) {
                    if (input % 400 == 0) {
                        System.out.println("Високосный");
                    }
                }
            } else {
                System.out.println(" Не высокосный");
            }

        }
    }
}
//try (Scanner sc = new Scanner(System.in)) {
//int year = sc.nextInt();
//
//    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//        System.out.println("Високосный");
//    } else {
//            System.out.println("Не високосный");
//    }
//            }
