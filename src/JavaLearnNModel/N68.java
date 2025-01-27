package JavaLearnNModel;
//Given the non-negative long integer n, output its most significant digit
//
//        Format of an input line is n.


import java.util.Scanner;

public class N68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        String cv = String.valueOf(input);
        var i = cv.charAt(0);
        System.out.println(i);


    }
}
