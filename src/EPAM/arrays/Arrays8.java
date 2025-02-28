package EPAM.arrays;
import java.util.Scanner;

public class Arrays8 {
    public static int getResult(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                max = Math.max(max, a[i]);
            } else {
                min = Math.min(min, a[i]);
            }
        }
        return max+min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(getResult(arr));
    }
}
