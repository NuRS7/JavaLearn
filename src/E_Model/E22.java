package E_Model;

import java.util.Scanner;
import java.text.DecimalFormat;

public class E22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {


            DecimalFormat df = new DecimalFormat("0.000");
            double length = sc.nextDouble();
            double width = length / 2.0;
            double result = length * width;
            System.out.println(df.format(result));
        }
    }
}

