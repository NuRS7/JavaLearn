package Neetcode;

import java.util.Arrays;
import java.util.Scanner;
public class LeetcCode283 {
    public  static void moveZeroes(int[] nums) {
        int n = nums.length;
        int Left =0, Right = 1;
        if(n<2) return;
        while(Left<Right){
            if(nums[Left] !=0){
                Left++;
                Right++;
            } else if (nums[Right] == 0) {
                Right++;
            } else{
                int temp = nums[Right];
                nums[Right] = nums[Left];
                nums[Left] = temp;

            }
            System.out.println(Arrays.toString(nums));
        }


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] arr = new int[input.length];
        for(int i = 0; i<input.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        moveZeroes(arr);
    }

}