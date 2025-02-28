package JavaRush;

import java.util.Scanner;

public class J18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int number = sc.nextInt();
        do {
            System.out.println(word);
            number--;
        } while (0 < number && 5 <= number);

    }
}

