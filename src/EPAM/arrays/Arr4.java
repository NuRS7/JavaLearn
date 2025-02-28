package EPAM.arrays;

import java.util.Scanner;

public class Arr4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int negative = 0;
        int zero = 0;
        int positive = 0;
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
            if (arr[i] < 0) {
                negative++;

            } else if (arr[i] == 0) {
                zero++;
            } else if (arr[i] > 0) {
                positive++;
            }
        }
        System.out.println(negative + " " + zero + " " + positive);

    }
}
