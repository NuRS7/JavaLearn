package AlgorithimsAdd;

import java.util.Arrays;
import java.util.Random;

public class BubleSorting {
    public static int[] bublesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]> arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println(" Before");

        System.out.println(Arrays.toString(bublesort(numbers)));
        System.out.println(" After");
        bublesort(numbers);

    }
}
