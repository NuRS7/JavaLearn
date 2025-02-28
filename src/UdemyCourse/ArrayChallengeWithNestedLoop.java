package UdemyCourse;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallengeWithNestedLoop {

    public static int[] notSortedArray(int len) {

        Random random = new Random();
        int[] randomArray = new int[len];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        return randomArray;
   }

    public static int[] sortedArray(int[] nums) {
        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        int temp;
        boolean flag =true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i + 1];
                sortedArray[i + 1] = temp;
                flag = true;
            }
        }
        System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }



    public static void main(String[] args) {
        System.out.println(sortedArray(notSortedArray(5)));

        sortedArray(notSortedArray(5));

    }
}
