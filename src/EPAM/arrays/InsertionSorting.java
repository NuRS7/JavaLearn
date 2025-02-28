package EPAM.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSorting {
    public static void sort(int[] a, int k) {
        int n = a.length;
        for (int i = 0; i <= k; i++) {
            int minIndex = a[i];  // сохраняем значение элемента на позиции i
            int j = i - 1;  // начинаем проверку с элемента перед i
            while(j >= 0 && a[j] > minIndex) {  // пока j >= 0 и элемент a[j] больше, чем minIndex
                a[j + 1] = a[j];  // сдвигаем элемент вправо
                j--;  // идем к предыдущему элементу
            }
            a[j + 1] = minIndex;  // вставляем minIndex в правильное место
        }
        System.out.println(Arrays.toString(a));  // выводим отсортированный массив
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 6, 8};

        int k = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        sort(arr, k);



    }

}
