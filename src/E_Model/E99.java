package E_Model;

import java.util.*;

public class E99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] arr = input.split(" ");
        int max = Integer.MIN_VALUE;
        for (String num : arr) {
            int currentNum = Integer.parseInt(num);
            if (currentNum > max) {
                max = currentNum;
            }
        }
        System.out.print(max);
    }
}