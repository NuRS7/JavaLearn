package EPAM.arrays;

import java.util.Scanner;

public class Arr7 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int getResult(int[] a) {
        //put your code here
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrime(i)) {
                sum += a[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        int result = getResult(array);
        System.out.println(result);
    }
}
