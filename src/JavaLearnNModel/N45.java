package JavaLearnNModel;

public class N45 {
    public static void main(String[] args) {
        // Перебираем все числа от 100 до 999
        for (int num = 100; num < 1000; num++) {
            // Извлекаем цифры числа
            int hundreds = num / 100;  // Сотни
            int tens = (num / 10) % 10;  // Десятки
            int ones = num % 10;  // Единицы

            // Проверяем, является ли число палиндромом
            if (hundreds == ones) {
                // Если сотни и единицы одинаковы, то это палиндром
                System.out.println(num);
            }
        }
    }
}
