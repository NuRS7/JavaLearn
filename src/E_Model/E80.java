package E_Model;

import java.util.Scanner;

public class E80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for (String numbers : arr) {
            int num = Integer.parseInt(numbers);
            if (num == 0) {
                break;

            }
            if(num % 2 != 0) {
                count++;
            }

        }

        System.out.println(count);
    }

}
