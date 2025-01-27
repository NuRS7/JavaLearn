package JavaLearnNModel;

import java.util.Scanner;

public class N80 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNextInt()) {
                int data = sc.nextInt();
                System.out.println(data);
            }
        }
    }
}
