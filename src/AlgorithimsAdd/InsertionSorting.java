package AlgorithimsAdd;

import java.util.Arrays;
import java.util.Random;

public class InsertionSorting {
    private static void printArray(int[] numbers) {
        for (int i = 0; i< numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];
            int j = i - 1;

            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
        System.out.println(Arrays.toString(inputArray));

    }
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println(" Before insertion sorting: ");
        printArray(numbers);
        System.out.println(" After insertion sorting: ");
        insertionSort(numbers);

    }
}
