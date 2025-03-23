package EPAM.arrays.repeatingArray;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {


        int[] array;
        int[] arrayInt = new int[100];
        int[] amountDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int size = amountDays.length;
        for (int i = 0; i < size; i++) {
            if (amountDays[i] < 31) {
                amountDays[i] = 0;
            }
            arrayInt[i] = amountDays[i];
        }
        array = amountDays;
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(amountDays));
        System.out.println(Arrays.toString(array));
    }


}
