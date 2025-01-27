package JavaLearnNModel;

import java.util.Scanner;

public class N71 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            do {
                a /= 10;


            }
            while (a >= 10);{

                System.out.println(a);


            }
        }
    }
}
