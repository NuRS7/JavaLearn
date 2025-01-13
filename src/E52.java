import java.util.Scanner;

public class E52 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (Math.abs(a) <= Math.abs(b)) {
                System.out.println(a);

            }
            else {
                System.out.println(b);
            }


        }
    }
}
