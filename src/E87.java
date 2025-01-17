import java.util.Scanner;

public class E87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        double step = b - a / n - 1;
        for (int i = 0; i < n; i++) {
            System.out.println(i);

        }
        System.out.println(step);



    }
}
