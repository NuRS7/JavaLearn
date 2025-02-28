package E_Model;

import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        // Код для решения задачи
        try (Scanner sc = new Scanner(System.in)) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            double area1 = x1 * y1;
            double area2 = x2 * y2;

            // Сравниваем площади
            if (area1 == area2) {
                System.out.println(0);  // Если площади равны
            } else if (area1 > area2) {
                System.out.println(1);  // Если площадь первого прямоугольника больше
            } else {
                System.out.println(-1); // Если площадь второго прямоугольника больше
            }
        }
    }
}

