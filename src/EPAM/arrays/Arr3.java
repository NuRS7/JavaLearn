package EPAM.arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Arr3 {
    public static int getResult(int[]a, int m) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                a[i] = m;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int[] arr = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            arr[i - 1] = Integer.parseInt(input[i]);
        }
        int count = getResult(arr, k);

        // Выводим количество замен

        // Выводим измененный массив
        System.out.println(Arrays.toString(arr)+", "+count);

    }
}
