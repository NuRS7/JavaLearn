package E_Model;
//Given the lengths a and b of two legs of a right triangle.
//Calculate its perimeter and area and output them to 3 decimal places.
//Input data are correct.

import java.util.Scanner;
public class E26 {
    public static void main(String[] args) {
        //put your code here
        try(Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = Math.sqrt(a * a + b * b);
            double perimeter = a + b + c;
            double area = 0.5 * a * b;


            System.out.printf("%.3f %.3f", perimeter, area);
        }
    }
}
