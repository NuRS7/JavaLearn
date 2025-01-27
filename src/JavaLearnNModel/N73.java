package JavaLearnNModel;

import java.util.Scanner;

//Given the non-negative long integer n, output the number of even digits in it.
//
//Format of an input line is n.
public class N73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eventCount = 0;
        int input = scanner.nextInt();


        while (input > 0) {
            int a = input % 10;
            if (a % 2 == 0) {
                eventCount++;
            }
            input /= 10;
        }
        System.out.println(eventCount);
    }
}
