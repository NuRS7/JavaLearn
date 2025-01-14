import java.util.Scanner;
public class E58 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double x = sc.nextDouble();
            var result = (a * x) + b;
            if (result < 0) {
                result = -result;
            }
            System.out.printf("%.3f", result);
        }
    }
}
