package E_Model;

import java.util.Scanner;

public class E100 {
    public static int max() {

        // Put your code here
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");

        for (String num : arr) {
            int currentNum = Integer.parseInt(num);
            if (currentNum > max) {
                max = currentNum;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
