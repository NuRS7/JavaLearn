package E_Model;

import java.util.Scanner;

public class N2 {
    public static int max() {

        // Put your code here
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            int currentNum = sc.nextInt();
            if (currentNum == 0) { // in array если мы имеем zero завершиться цикл
                break;
            }
            if (currentNum > max) {
                max = currentNum;
            }
        }

        return max; //
    }

    public static void main(String[] args) {


        // Get a result of your code

        System.out.println(max());
    }
}