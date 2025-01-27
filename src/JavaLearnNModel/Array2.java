package JavaLearnNModel;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] array = {1, 23, 4, 25, 32,};
        int[] hold = {1, 21, 321, 4, 14, 123, 13, 154, 15, 16, 33};;
        System.arraycopy(array, 0, hold, 0, array.length);
        System.out.println(Arrays.toString(hold));
    }
}
