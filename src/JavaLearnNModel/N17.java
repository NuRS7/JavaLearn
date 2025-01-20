package JavaLearnNModel;

import java.util.*;
public class N17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pizza = 8;
        int people = 12;

        while (true){
            int piece = sc.nextInt();
            int result = (int) Math.floor(piece * pizza / people);
            if (piece == 0) {
                break;
            }

            System.out.println(result);
        }


    }
}
