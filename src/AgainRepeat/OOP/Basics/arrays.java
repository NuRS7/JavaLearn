package AgainRepeat.OOP.Basics;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int nums[] = new int[4];
        for (int list : nums) {
            System.out.println(list);

        }
        int[] arr = new int[]{1, 3, 4, 5, 6};
        for (int list : arr) {
            System.out.println(list);
        }


        int[] arr2 = new int[3];
        arr2[0] = 1;
        arr2[1] = 5;
        arr[2] = 8;
        System.out.println(Arrays.toString(arr2));
        for (int arr1 : arr2) {
            System.out.println(arr1);
        }

        String[] arr3 = new String[3];
        arr3 = new String[]{"Nurs", "Astana", "KZ"};
        System.out.printf(ArrayToString(arr3));

    }

    private static String ArrayToString(String[] arr) {
        return Arrays.toString(arr);
    }
}
