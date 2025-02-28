package EPAM.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays12 {

    public static void compress(int[] a) {
        int n = a.length;
        int index = 0;

        // 1. Собираем элементы с четными индексами в начало массива
        for (int i = 0; i < n; i += 2) {
            a[index++] = a[i];
        }

        // 2. Заполняем оставшиеся элементы нулями
        while (index < n) {
            a[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        compress(arr);
        System.out.println(Arrays.toString(arr));  // Выводим измененный массив
    }
}
