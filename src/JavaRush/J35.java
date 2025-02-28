package JavaRush;

import java.util.Arrays;

public class J35 {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static void main(String[] args) {
        if (array.length % 2 == 0) {
            var first = array.length / 2;

        } else {
            var second = array.length / 2 + 1;
        }
    }
}
