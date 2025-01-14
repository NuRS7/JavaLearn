//Task description
//Given the digit d, output digits from 0 to d inclusively.
//
//
//
//Format of an input line is d.


import java.util.Scanner;

public class E72 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            for (int i = 0; i <= a; i++) {
                System.out.print(i + " ");
            }

        }
    }
}
