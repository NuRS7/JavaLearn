package JavaRush;

import java.util.Scanner;

public class J9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (sc.hasNextInt()) {
                count++;
                sc.nextLine();
            }
        }
        System.out.println(count);

    }
}
