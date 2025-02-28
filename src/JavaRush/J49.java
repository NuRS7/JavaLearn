package JavaRush;

import java.util.Scanner;

public class J49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[200];
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Positive numbers are: ");
        int pos = sc.nextInt();
        System.out.println("Index numbers are: ");
        int element = sc.nextInt();

        for (int i = pos; i < size; i++) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = element;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.println(i+"-> "+arr[i]);
        }
    }
}
