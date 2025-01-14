import java.util.Scanner;

public class E67 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int k = sc.nextInt();
            if (k < 0) {
                throw new IllegalArgumentException("Wrong k value");
            }
            System.out.print((a % k == 0) + " ");
            System.out.print((b % k == 0) + " ");
            System.out.println(c % k == 0);
            sc.close();

        }
    }
}
