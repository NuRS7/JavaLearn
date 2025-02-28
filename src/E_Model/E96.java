package E_Model;

import java.util.Scanner;

public class E96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();

        if (count == 0) {
            System.out.println("Output is 0");

        } else if (count < 0) {
            System.out.println("Why negative?");

        }
        else {
            String[] names = new String[count];
            for (int i = 0; i < count; i++) {
                names[i] = sc.nextLine();
            }
            for (String name : names) {
                System.out.println("names:"+" "+ name);
            }


        }

    }
}
