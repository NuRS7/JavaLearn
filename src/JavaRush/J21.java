package JavaRush;

import java.util.Scanner;

//Давай разделим ящик колы на кабинет программистов. Для этого напишем программу, в которой:
//
//Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике. Второе - количество людей в кабинете.
//Вывести на экран результат деления первого числа на второе.
public class J21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = (double) (a)/(b);
        System.out.println(result);

    }
}
