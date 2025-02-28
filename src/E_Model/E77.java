package E_Model;

import java.util.Scanner;

public class E77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m < n) {
            for(int i = n; i >= m; i--) {
                if(i % 2 == 0) {
                    System.out.println(i);
                }

            }
        }
    }
}
