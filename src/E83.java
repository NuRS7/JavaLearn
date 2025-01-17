import java.util.Scanner;

public class E83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double n = sc.nextDouble();

        for(double x = a; x< b; x+=n ) {
            double fx = 1 + 2 * Math.sin(x);
            System.out.printf("%.3f ", fx);


        }

    }
}
