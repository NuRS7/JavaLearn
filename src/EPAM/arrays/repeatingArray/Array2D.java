package EPAM.arrays.repeatingArray;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] Array2D = new int[10][30];
        int[][] arr = { {1, 2, 3, 4},
                        {5, 6, 7, 8}
        };
        String[] ejgStr = new String[][] { new String[]{"F" }, new String[] { "a", "b", "c" }, { new String() } }[0];
        System.out.println(Arrays.toString(ejgStr));
        for(int i=  0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
