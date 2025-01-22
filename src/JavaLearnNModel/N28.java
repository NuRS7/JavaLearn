package JavaLearnNModel;

import java.util.Scanner;

public class N28 {
    public static void main(String[] args) {

        //1 средняя
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float sum = a + b;
        float diff = a - b;
        float prod = a * b;
        if ( b != 0){
             float quot = a / b;
            System.out.println(sum + " " + diff + " " + prod + " " + quot);
        } else {
            System.out.println("Ошибка 0");
        }




        // 2 средняя
        int sec = sc.nextInt();
        int hours = sec / 3600;
        int min = (sec - hours * 3600) / 60;
        int remainingSec = sec % 60;
        System.out.println(hours + "часов"+ " " + min+" минутов"+ remainingSec+ " "+ " секунд");

        // 3 средняя
        int num = sc.nextInt();
        if (num % 2==0) {
            System.out.println(num+" четное");
        } else {
            System.out.println(num+" нечетное");
        }

    }


}
