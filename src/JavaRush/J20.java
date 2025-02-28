package JavaRush;

import java.util.Scanner;

public class J20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pi = 3.14;
        var result = (int) Math.floor(pi * r * r);
        System.out.println(result);

    }
}