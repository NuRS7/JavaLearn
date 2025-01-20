package JavaLearnNModel;

import java.util.Scanner;
public class N26 {
    public static void main(String[] args) {

        //1
        int a = 10;
        double b = 10.0;
        char c = 'c';
        boolean d = false;
        System.out.println(a + " " + b + " " + c + " " + d);

        //2
        String name = "Nursultan";
        var s = name.length();
        System.out.println(s);

        try (Scanner sc = new Scanner(System.in)) {
            int C = sc.nextInt();
            int F = C * 9 / 5 + 32;
            System.out.println(F);
        }
        }

    }

