package E_Model;

import java.util.Scanner;

public class E84
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double n = sc.nextDouble();


        for (double x = a; x < b; x += n) {
            System.out.println(x);
        }
    }
}
