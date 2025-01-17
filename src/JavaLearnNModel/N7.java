package JavaLearnNModel;

import java.util.Scanner;

public class N7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Число: " + number);
        } else {
            System.out.println("Это не число.");
        }



    }
}
// hasNextInt() проверяет, есть ли следующее целое число в потоке ввода.
// осы арқылы тексере аламыз сан ба или жок па деп яғни if(sc.hasNextInt()) if блогы болса онда
// блокы іске қосамыз егер ол сан болса егер ол басқа тип болса else жіберіліп ошибка шығады.