package E_Model;

import java.util.Scanner;

public class E79 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");

            int sum = 0;
            for (String numbers : arr) {
                int num = Integer.parseInt(numbers);
                if (num == 0) {
                    break;

                }
                sum += num;
                System.out.print(num+ " ");
            }

            System.out.print(sum);

        }

    }
}
