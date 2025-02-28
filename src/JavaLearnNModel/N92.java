package JavaLearnNModel;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class N92 {
    public static void main(String[] args) {
        int[] firstArray = getRandom(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = new int[10];
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));
        int[] thirdArray = getRandom(10);
        System.out.println(Arrays.toString(thirdArray));
        int[] forthArray = Arrays.copyOf(thirdArray, thirdArray.length);



    }

    private static int[] getRandom(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);


        }
        return newInt;


    }
}
