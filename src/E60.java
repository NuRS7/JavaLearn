import java.util.Scanner;

public class E60 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a ==b && b == c) {
                System.out.println("True");

            } else {
                System.out.println("False");
            }

        }


    }
}
