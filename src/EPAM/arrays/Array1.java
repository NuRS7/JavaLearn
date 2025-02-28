package EPAM.arrays;

class Array1 {

    /**
     * @param a the given array
     * @param k > 0 the given number
     * @return an array containing the first k positive elements of the array a
     */
    public static int[] getResult(int[] a, int k) {
        // Создаем массив для хранения k положительных чисел
        int[] result = new int[k];
        int index = 0; // Индекс для массива result

        // Перебираем массив a и выбираем первые k положительных чисел
        for (int num : a) {
            if (num > 0) {
                result[index++] = num;
                if (index == k) { // Как только набрали k чисел, выходим
                    break;
                }
            }
        }

        return result; // Возвращаем результат
    }

    // Для тестирования
    public static void main(String[] args) {
        int[] a = {-1, 5, 6, 0, -3, 2, 8};
        int k = 3;

        int[] result = getResult(a, k);

        // Вывод результата
        System.out.println(java.util.Arrays.toString(result)); // [5, 6, 2]
    }
}
