package JavaLearnNModel;

import java.util.Scanner;
public class N81 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите высоту прямоугольника:");
            int height = sc.nextInt();
            System.out.println("Введите ширину прямоугольника:");
            int width = sc.nextInt();

            int i = 0; // Счётчик для строк (высота)
            while (i < height) {
                int j = 0; // Счётчик для символов в строке (ширина)
                while (j < width) {
                    // Условие для печати рамки
                    if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                        System.out.print("Б"); // Печатаем рамку
                    } else {
                        System.out.print(" "); // Оставляем середину пустой
                    }
                    j++;
                }
                System.out.println(); // Переход на следующую строку
                i++;
            }
        }
    }
}
