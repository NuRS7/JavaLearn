//Given two floating point numbers x and y.
//Output the value of the function f(x, y) = 2 * x + 5 * y - 10 to 3 decimal places.

import java.util.Scanner;
class E25 {

    public static void main(String[] args) {
        //put your code here
        try(Scanner sc = new Scanner(System.in)) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double result = 2 * x + 5 * y - 10;

            System.out.printf("%.3f", result);
        }

    }

}
