package JavaRush;

import java.util.Arrays;

public class J43 {
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i+" ");
        }

    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1]; // здесь array[0] = arr[5-0-1] то есть --> arr[0]=5
            array[array.length - i - 1] = temp; // последний элемент заменен на начальную arr[5-0-1] = 1;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        reverseArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }
}
