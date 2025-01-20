package JavaLearnNModel;

import java.util.Scanner;
public class GoDutch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = sc.nextInt();    // Общая сумма счета
            int people = sc.nextInt(); // Количество друзей

            // Проверка на отрицательную сумму
            if (sum < 0) {
                System.out.println("Bill total amount cannot be negative");
                return;
            }

            // Проверка на количество людей (нельзя <= 0)
            if (people <= 0) {
                System.out.println("Number of friends cannot be negative or zero");
                return;
            }

            // Вычисление итоговой суммы на человека (включая 10% чаевых)
            int total = (sum + (sum / 10)) / people;
            System.out.println(total);
        }
    }
}
