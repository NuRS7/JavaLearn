package EPAM.arrays;

import java.util.Arrays;

public class SortingSumOfPrevious1 {


        public static void main(String[] args) {
            int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

            System.out.println(Arrays.toString(getSumCheckArray(array)));
        }

        public static boolean[] getSumCheckArray(int[] array){

            //put your code here
            if (array == null) {
                throw new IllegalArgumentException();
            }
            int n = array.length;
            boolean result[] = new boolean[n];

            result[0] = false;
            result[1] = false;

            for (int i = 2; i < n; i++) {
                result[i] = (array[i] == array[i - 1] + array[i - 2]);
            }
            return result;

        }
    }
