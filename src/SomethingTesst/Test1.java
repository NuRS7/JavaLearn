package SomethingTesst;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static int[] getResult(int[] a, int k) {
        int[] result = new int[k];
        int index = 0;
        for (int num : a) {
            if (num < 0) {
                result[index++] = num;
                if (index == k) {
                    break;

                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] result = input.split(" ");
        int k = Integer.parseInt(result[0]);
        int[] a = new int[result.length - 1];
        for (int i = 1; i < result.length; i++) {
            a[i - 1] = Integer.parseInt(result[i]);

        }
        System.out.println(Arrays.toString(getResult(a, k)));

    }
}
