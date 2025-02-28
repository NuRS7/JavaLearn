package EPAM.arrays;

import java.util.Scanner;
class Solution {

    /**
     * @param a the given array
     * @param c the given number
     * @param d the given number
     * @return the number of elements of the array a that belong to the segment [?, d]
     */
    public static int getResult(int[] a, int c, int d) {
        //put your code here
        int count = 0;
        for(int k = 0; k< a.length; k++){
            if(c <a[k] && a[k]>= d){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = new int[]{0, 10, 3, -1, 10, 10, 0, 15, 20};
        int c = arr[0];
        int d = arr[1];
        for (int i = 2; i < arr.length-2; i++) {
            arr[i-2 ] = arr[i];
        }
        System.out.println(getResult(arr,c,d));
    }
}
