package JavaLearnNModel;
//Given the non-negative long integer n, output the number of even digits in it.
//        Format of an input line is n.
import java.util.Scanner;

public class N72 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long data = sc.nextLong();
            int sum = 0;
            int even_amount = 0;
            do {
                long a = data % 10;
                if (a % 2==0) {
                    even_amount++;
                }
                data /= 10;
            }
            while (data >= 1); {

            }
            System.out.println(even_amount);
        }
    }
}
