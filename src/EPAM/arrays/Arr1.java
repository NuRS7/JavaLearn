package EPAM.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arr1 {


    public static int[] getResult(int[] a, int k) {
        int[] result = new int[k]; //
        int index = 0;
        for (int num : a) {
            if (num > 0) {
                result[index++] = num;
                if (index == k) {
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" "); //["3", "-1", "5", "6", "0", "-3", "2", "8"]
        int k = Integer.parseInt(input[0]); // первый элемент 3
        int[] a = new int[input.length - 1]; // length 8 болса 7 қылып
        for (int i = 1; i < input.length; i++) { // бірінші элемениттен бастаймыз нөл элемент ол размер болып кетеді
            a[i - 1] = Integer.parseInt(input[i]); // манипуляуия жасайммыз то есть элементтердің индекциясын фориктан өткеннен кейін қайтадан орнына әкелеміз мысалы
            // фориктен отпестен бурын 3 4 5 5 3 болса 3 бастапкы сайз болып калады да 4тен басталып 1 элемент индекция бойынша журеди
            // сосын a[i-1] аркылы 4-index-->0 5-->1, 5-->2 3-->3 сактаймыз
        }
        System.out.println(Arrays.toString(getResult(a, k)));

    }

}