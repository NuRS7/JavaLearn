package UdemyCourse;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    private static int[] getRandom(int len) {
        Random random = new Random();
        int[] arr = new int[len];

        // Заполнение массива случайными числами
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(1000); // Числа от 0 до 99
        }

        // Сортировка массива
        Arrays.sort(arr);

        // Реверсирование массива с использованием for
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Печать реверсированного массива
        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static void main(String[] args) {
        getRandom(10);  // Генерация массива из 10 случайных чисел
    }
}
