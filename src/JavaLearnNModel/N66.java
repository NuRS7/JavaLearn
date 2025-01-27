package JavaLearnNModel;

import java.util.Scanner;
//Given the two integers m and n (where 33 <= m < n < 127), output ASCII symbols with codes from m to n inclusively.
//Format of an input line is m n.
public class N66 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            for (int i = m; i <= n; i++) {
                char symbol = (char) i;
                System.out.print(symbol);
            }




        }
    }
}
