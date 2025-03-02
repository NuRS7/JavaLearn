package EPAM.arrays;
import java.util.Arrays;

public class CycleSwap {
    // Метод для циклического сдвига на 1 позицию
    static void cycleSwap(int[] array) {
        if (array == null || array.length < 2) {
            return; // Нет смысла сдвигать пустой массив или массив из одного элемента
        }
        cycleSwap(array, 1);
    }

    // Метод для циклического сдвига на shift позиций
    static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length < 2 || shift == 0) {
            return; // Нет необходимости сдвигать массив
        }

        int n = array.length;
        shift = shift % n; // Убираем лишние циклы, если shift >= n

        // Используем временный массив для перестановки
        int[] temp = new int[n];

        // Переносим последние shift элементов в начало
        System.arraycopy(array, n - shift, temp, 0, shift);
        // Переносим первые n-shift элементов в конец
        System.arraycopy(array, 0, temp, shift, n - shift);
        // Копируем обратно в исходный массив
        System.arraycopy(temp, 0, array, 0, n);
    }
}

