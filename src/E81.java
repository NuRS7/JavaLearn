//Given the positive integer n, output the sum of the squares of numbers from 1 to n inclusively.

import java.util.Scanner;

public class E81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= a; i++) {
            result += i*i;
        }

        System.out.println(result);
}
}
