package JavaLearnNModel;
//Given the positive integer n, output the sum 1/1 + 1/2 + 1/3 + ... + 1/n to three decimal places.
import java.util.Scanner;

public class N63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double k = 0.0;
        for (int i = 1; i <= n; i++) {
            k += 1.0 / i;

        }
        System.out.printf("%.3f", k);

        }





    }

