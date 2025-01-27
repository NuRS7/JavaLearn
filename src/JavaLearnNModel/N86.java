package JavaLearnNModel;

import java.util.Scanner;

public class N86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secret = "enough";
        while (true) {
            String input = sc.nextLine();
            if (input.equals(secret) ) {
                break;
            }
            System.out.println(input);

        }
    }
}
