package EPAM.arrays;
import java.util.Arrays;

public class Sorting1 {
    public static void sort(int[] a, int k) {
        //put your code here
        int n = a.length;
        for (int i = 0; i < k; i++) {
            int minValue = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minValue]) {
                    minValue = j;
                }
        }
            int temp = a[i];
            a[i] = a[minValue];
            a[minValue] = temp;
            }
        System.out.println(Arrays.toString(a));
        }
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 8, 6, 2, 5};
        int k = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            array[i - 1] = array[i];
        }
        sort(array, k);

    }
}
