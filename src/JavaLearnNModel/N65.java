package JavaLearnNModel;

import java.util.Scanner;

public class N65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *=i;
        }
        System.out.println(sum);

    }
}
