
package JavaLearnNModel;
import java.util.Scanner;

/*
Три числа
*/

public class N76 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a == b ) {
            System.out.print(a + " "+b);
            if (b == c) {
                System.out.print(" "+ c);
            }

        } else if (a == c) {
            System.out.println(a + " " + c);
        } else if (b == c) {
            System.out.println(b+ " "+ c);
        } else  if(a ==b) {

        }

    } }

