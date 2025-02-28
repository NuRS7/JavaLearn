package AlgorithimsAdd;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i<arr.length; i++) {
            int temp = arr[i]; //  пока arr[0] --> 1

            arr[i] = arr[arr.length - i - 1]; // new arr[i] = arr[4] => arr[0] = 5 [1,2,3,4,5]
            arr[arr.length - i - 1] = temp; // переворот то есть arr[5-i-1] ==temp arr[4] = 1
            System.out.println(Arrays.toString(arr));
            break; // [5, 4, 3, 2, 1]

        }
    }
}
