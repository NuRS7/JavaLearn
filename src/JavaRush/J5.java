package JavaRush;

import java.util.Scanner;

public class J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (num < min) {
                second_min = min;
                min = num;
            } else if (num > min && num < second_min) {
                second_min = num;
            }

        }
        sc.close();
        if (second_min == Integer.MAX_VALUE) {
            System.out.println("Нет второго минимального числа");

        } else {
            System.out.println(second_min);
        }


    }
}
