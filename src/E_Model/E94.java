package E_Model;

import java.util.Scanner;

public class E94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();

        if (number == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (number < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            String[] names = new String[number];
            for (int i = 0; i < number; i++) {
                names[i] = sc.nextLine();
            }
            for (String name: names) {

                System.out.println("Hello, " + name);
            }
        }


    }
}
