package EPAM.arrays;

import java.util.Scanner;

public class Arr11 {
    public static int getResult(int[] a) {
        //put your code here
        int minValue = Integer.MAX_VALUE;
        int count = 0;
        int n = a.length;

        for (int i = 0; i < n; i++) {
            if (a[i] < minValue) {
                minValue = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (minValue < a[i]) {
                count++;
            }
        }


        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int result = getResult(arr);
    }
}
