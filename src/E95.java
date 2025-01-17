import java.util.Scanner;

public class E95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        int day = 1;
        int h1 = h - a;

        int result = day + (h1 / (a - b));
        System.out.println(result);
    }
}
