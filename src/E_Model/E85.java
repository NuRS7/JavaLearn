package E_Model;//
//        double fx = x > 2 ? x : 2 * x + 1;
//        System.out.println(fx);
import java.util.Scanner;

public class E85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double fx = 0;
        if (x>2){
            System.out.println(x);

        } else {
            fx = 2 * x + 1;
        }
        System.out.println(fx);
    }
}

