package JavaRush;

import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int max_value = Integer.MAX_VALUE;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

    }

}
