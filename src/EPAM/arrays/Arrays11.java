package EPAM.arrays;

public class Arrays11 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 2, 2, 3, 5, 10};
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (min < array[i]) {
                count++;
            }

        }
        System.out.println(count);
    }
}
