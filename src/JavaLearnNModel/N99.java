package JavaLearnNModel;

import java.util.Scanner;

public class N99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()){
            System.out.println(Integer.MAX_VALUE);
        }
        int min = sc.nextInt();

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < min) {
                min = n;
            }

        }
        System.out.println(min);
    }
}
