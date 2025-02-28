package E_Model;

import java.util.Scanner;

public class E97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        int count = h - a;

        if (a<=b && b<=h) {
            System.out.println("Impossible");
        } else {
            int result = 1 + (count / (a - b));
            System.out.println(result);

        }

    }
}
