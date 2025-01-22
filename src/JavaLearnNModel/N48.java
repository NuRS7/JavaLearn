package JavaLearnNModel;

import java.nio.file.NotDirectoryException;
import java.util.Scanner;

public class N48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gbd = 1;
        int min = Math.min(a, b);


        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gbd = i;

            }
        }
        System.out.println("Наибольший общий делитель: " + gbd);

    }
}
