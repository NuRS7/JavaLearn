package E_Model;//Given floating point numbers a, b, c, d.
//Output max{d - a, d - b, d - c} to 3 decimal places.
import java.util.Scanner;

class E73 {

    public static void main(String[] args) {
        //put your code here
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();


            double f = d - a;
            double g = d - b;
            double h = d - c;

            double max = f;
            if (g > max) {
                max = g;
            }
            if (h > max) {
                max = h;

            }

            System.out.printf("%.3f", max);


        }
    }
}