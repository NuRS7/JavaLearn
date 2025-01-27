package JavaLearnNModel;

import java.util.Scanner;

public class N88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ввод числа n
        int n = sc.nextInt();

        // Счетчик подходящих чисел
        int count = 0;

        // Перебор всех четырёхзначных чисел
        for (int num = 1000; num <= 9999; num++) {
            // Находим сумму цифр числа
            int sum = getDigitSum(num);

            // Если сумма равна n, увеличиваем счетчик
            if (sum == n) {
                count++;
            }
        }

        // Вывод результата
        System.out.println( count);
    }

    // Метод для вычисления суммы цифр числа
    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Берем последнюю цифру и добавляем к сумме
            num /= 10;       // Убираем последнюю цифру
        }
        return sum;
    }
}