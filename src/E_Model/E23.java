package E_Model;

import java.util.Scanner;

public class E23 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int a = sc.nextInt();
            int result = Math.abs(a) % 10;


            System.out.println(result);


        }


    }
}

