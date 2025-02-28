package EPAM.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumOfPrevious {


    public static boolean[] getArray(int[] arr) {


        int n = arr.length;

        boolean[] result = new boolean[n];

        result[0] = false;
        result[1] = false;
        for (int i = 2; i < n; i++) {
            result[i] = (arr[i] == arr[i - 1] + arr[i - 2]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] array = new  int[input.length];
        for (int i = 0; i< input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        System.out.println(Arrays.toString(getArray(array)));
        }
    }



