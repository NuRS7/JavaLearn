package JavaLearnNModel;

import java.util.Scanner;

//Реализуйте калькулятор: пользователь вводит два числа и оператор
//        (+, -, *, /), а программа выполняет соответствующую операцию.
public class N36 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double firstNum = sc.nextInt();
            double secondNum = sc.nextInt();

            double multiplication = firstNum * secondNum;
            double minus = firstNum - secondNum;
            double plus = firstNum + secondNum;
            if (secondNum > 0) {
                double division = firstNum / secondNum;
                System.out.println("minus =" + minus);
                System.out.println("plus =" + plus);
                System.out.println("multiplacation =" + multiplication);
                System.out.println("devision = "+ division );
            } else
                System.out.println("Вводите другое число");



        }
    }
}
