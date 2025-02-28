package E_Model;//Given floating point numbers a and b.
//If a is less than b, then output 7, otherwise 8. 
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        //put your code here
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (a>b) {
                System.out.println(7);

            } else {
                System.out.println(8);

            }

        }
        }
    }
