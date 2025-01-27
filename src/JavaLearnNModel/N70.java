package JavaLearnNModel;

import java.util.Scanner;

public class N70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_data = sc.nextInt();

        while (true) {
            while (input_data >= 10) {
                input_data /= 10;
            }
            System.out.println(input_data);
            break;
        }
    }
}
