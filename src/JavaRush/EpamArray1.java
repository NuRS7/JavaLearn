package JavaRush;

import java.util.ArrayList;
import java.util.Scanner;

//Given a positive integer k and an integer array a (containing at least k positive elements),
//
//create an array containing the first k positive elements in array a.
//
//
//
//Format of an input line is k a, where elements of an array a are also separated with a space, see test data sets.
public class EpamArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>(k);
        while (sc.hasNextInt() && result.size() < k) {
            int number = sc.nextInt();
            if (number > 0) {
                result.add(number);
            }
        }
        sc.close();
        System.out.println(result);
    }
}


