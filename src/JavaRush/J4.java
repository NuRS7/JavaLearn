package JavaRush;

import java.util.ArrayList;
import java.util.Scanner;

public class J4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;


        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());

        }
        sc.close();
        if (numbers.size() < 2) {
            System.out.println("Ошибка");
            return;
        }

    }
}



