import java.util.Scanner;

public class E78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Чтение строки целых чисел
        String input = sc.nextLine();

        // Разбиваем строку на массив строк
        String[] numbers = input.split(" ");

        int sum = 0;

        // Проходим по числам
        for (String num : numbers) {
            int number = Integer.parseInt(num);  // Преобразуем строку в число
            if (number == 0) {
                break;  // Если встретили 0, останавливаемся
            }
            sum += number;  // Добавляем число к сумме
        }

        // Выводим сумму
        System.out.println(sum);

        sc.close();
    }
}
