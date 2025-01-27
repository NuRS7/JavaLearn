package JavaLearnNModel;

import java.util.Scanner;

public class N83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите height: ");
        int height = sc.nextInt();
        System.out.println("Напишите width: ");
        int width = sc.nextInt();
        int i = 0;
        while (i < height) {
            int j = 0;
            while (j < width) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
