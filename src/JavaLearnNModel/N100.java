package JavaLearnNModel;

import java.util.Scanner;

public class N100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }


        }
        System.out.println(min);



    }
}
