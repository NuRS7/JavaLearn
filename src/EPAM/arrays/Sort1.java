package EPAM.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort1 {

    public static void partialSelectionSort(int[] a, int k) {
        int n = a.length;

        for (int i = 0; i < k; i++) {
            int minIndex = i;

            // Находим индекс минимального элемента в подмассиве [i, n-1]
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // Меняем местами текущий элемент с найденным минимальным
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;

            // Выводим частично отсортированный массив после каждой итерации
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int k = Integer.parseInt(input[0]);  // Считываем k
        int[] arr = new int[input.length - 1];

        for (int i = 1; i < input.length; i++) {
            arr[i - 1] = Integer.parseInt(input[i]);
        }

        partialSelectionSort(arr, k);
    }
}
