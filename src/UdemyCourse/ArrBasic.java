package UdemyCourse;

import java.util.Arrays ;
import java.util.Random;

public class ArrBasic {
    public static void main(String[] args) {
        int[] firstArr = getRandomArray(10);
        System.out.println(java.util.Arrays.toString(firstArr));

        java.util.Arrays.sort(firstArr);
        System.out.println(java.util.Arrays.toString(firstArr)); //sorted version

        int[] secondArr = getRandomArray(10);
        System.out.println(java.util.Arrays.toString(secondArr));
        java.util.Arrays.fill(secondArr, 5); //Adding all elements 5
        System.out.println(java.util.Arrays.toString(secondArr)); //[5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

        int[] thridArr = getRandomArray(10);
        System.out.println(java.util.Arrays.toString(thridArr));

        int[] forthArr = java.util.Arrays.copyOf(thridArr, thridArr.length);
        System.out.println(java.util.Arrays.toString(forthArr)); // copy full elements from thirdArr to forthArr
        java.util.Arrays.sort(forthArr);
        System.out.println(java.util.Arrays.toString(forthArr));

        int[] smallArr = java.util.Arrays.copyOf(thridArr, 5); // newLenght = 5
        System.out.println(java.util.Arrays.toString(smallArr)); //[5, 37, 77, 4, 65] we are get 5 element from thirArr


        // Binary Search
        String[] newArr = new String[]{"Nursultan", "Mark", "Maks", "Azamat", "Erkebulan"};
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
        if (Arrays.binarySearch(newArr, "Mark") >= 0) {
            System.out.println("Mark in list");
        }


        //equal != OR ==

        int[] arr1 = new int[]{1, 2, 3, 3, 4};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }



    }
    private static int[] getRandomArray(int len) {
        Random rand = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++) {
            randomArray[i] = rand.nextInt(100);
        }
        return randomArray;
    }
}



