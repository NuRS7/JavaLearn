package EPAM.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr6 {


    public static int[] getResult(int[] a) {
        //put your code here
        int[] value = new int[a.length];
        for (int i =0; i < a.length; i++) {
            if (a[i] > i) {
                value[i] = 1;
            } else {
                value[i] = 0;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        int[] result = getResult(array);
        System.out.println(Arrays.toString(result));
    }
}
