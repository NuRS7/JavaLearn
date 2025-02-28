package EPAM.arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Array4 {
    public static int[] getResult(int[] a) {
        int negative = 0;
        int zero = 0;
        int positive = 0;
        for (int num : a) {
            if (num < 0) {
                negative++;
            } else if (num == 0) {
                zero++;
            } else {
                positive++;
            }
        }
        //do not change the next line
        return new int[]{negative, zero, positive};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        int[] result = getResult(arr);
        System.out.println(Arrays.toString(result));
    }
}
