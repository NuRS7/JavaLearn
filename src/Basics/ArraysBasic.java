package Basics;


import java.util.Arrays;

public class ArraysBasic {
    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
                Thread.sleep(100);
            }
        }

        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        Object checkObj = arr;
        if (checkObj instanceof int[]) {
            System.out.println("Arr are int");
        }


    }
    }
