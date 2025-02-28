package EPAM.arrays;
//Given a segment [c, d], where c < d, and an integer array a,
//
//        count the number of elements in array a that belong to the segment [c, d].
//
//
//
//        Format of an input line is c d a, where elements of an array a separated with a space.
import java.util.Scanner;


class Arr9 {
    public static int getResult(int[] a, int c, int d) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (c <= a[i] && a[i] <= d) {
                count++;
            }
        }
        //put your code here
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int c = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int[] array = new int[input.length-2];
        for (int i = 2; i < input.length; i++) {
            array[i-2] = Integer.parseInt(input[i]); //manupulation index here -2 because c[0], d[1]
        }
        System.out.println(getResult(array, c, d));
    }
}