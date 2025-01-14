import java.util.Scanner;

public class E65 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            double avg = (a + b) / 2.0;
            System.out.printf("%.1f", avg);

        }
    }
}
