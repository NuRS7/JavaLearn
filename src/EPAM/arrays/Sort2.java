package EPAM.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort2 {
    public static void sort(int[] a, int k) {
        //put your code here
        for (int i = 1; i < k; i++) {
            int minValue = i;

            for(int j = i+1; j < a.length; j++) {
                if(a[j] < a[minValue]) {
                    minValue = j;
                }
            }
            int temp = a[i];
            a[i] = a[minValue];
            a[minValue] = temp;

        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String[] input = sc.nextLine().split(" ");
            int k = Integer.parseInt(input[0]);

            int[] array = new int[input.length -1];
            for (int i = 1; i < input.length; i++) {
                array[i-1] = Integer.parseInt(input[i]);
            }
            sort(array, k);
            sc.close();
        }

    }
}
