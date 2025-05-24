package AgainRepeat.OOP.Basics;

import java.util.Arrays;

public class dimensionalArrays {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array = new int[][]{{1, 2, 3},
                {3, 4, 5},
                {1, 32, 4}};
        int arr[][] = {{1, 3, 5},
                {1, 3, 4},
                {45, 56, 5}};

        for (int[] ara : arr) {
            for (int num : ara) {
                System.out.print(num + " ");
            }
        }
        for (int i = 0; i < array.length; i++) {
            int[] bb = array[i];
            for (int j = 0; j < bb.length; j++) {
                System.out.println(bb[j] + " ");
            }
        }
        for (int i = 0; i<array.length; i++) {
            int[] cc = array[i];
            toString(cc);
        }
        for (int d = 0; d < array.length; d++) {
            int[] yy = array[d];
            for (int oo : yy) {
                System.out.println(oo);
            }
        }
    }
    public static void toString(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

}
