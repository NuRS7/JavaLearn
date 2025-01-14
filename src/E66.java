import java.util.Scanner;

public class E66 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            int count = 0;
            if (a < 0) {
                count++;
            }
            if (b < 0) {
                count++;

            }
            if (c < 0) {
                count++;
            }
            System.out.println(count);
        }
    }
}
