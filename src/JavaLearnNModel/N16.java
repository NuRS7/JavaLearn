package JavaLearnNModel;

import java.util.Scanner;

public class N16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int sum = 0;
        int count = 0;


        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;

            }
            sum += num;
            count++;
        }
        int avarage = sum / count;
        System.out.println(avarage);

    }

}