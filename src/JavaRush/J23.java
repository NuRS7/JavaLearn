package JavaRush;

import java.util.Scanner;

public class J23 {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner sc = new Scanner(System.in);
        boolean b = sc.nextBoolean();
        if (b) {
            int res = (int) Math.ceil(glass);
            System.out.println(res);
        } else if (!b) {
            int i = (int) Math.floor(glass);
            System.out.println(i);
        }

    }
    }

