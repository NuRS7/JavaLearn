package JavaLearnNModel;

//import java.util.*;
//public class N18 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int people = sc.nextInt();
//        int pizza = sc.nextInt();
//
//        while (true){
//            int piece = 5;
//            int result = (int) Math.floor(piece * pizza / people);
//            if (people== 0) {
//                break;
//            }
//
//            System.out.println(result);
//            break;
//        }
//
//
//    }
//}

import java.util.Scanner;

public class N18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();  // Количество людей
        int pizza = sc.nextInt();   // Кусочки в одной пицце

        int k = 1; // Минимальное количество пицц
        while ((k * pizza) % people != 0) { // Проверяем условие
            k++;
        }

        System.out.println(k); // Выводим минимальное количество пицц
    }
}

