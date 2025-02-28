import java.util.Scanner;

public class U3 {
    public static int readElement() {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        readInteger(count);
        return count;
    }

    private static int[] readInteger(int count) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i< array.length; i++) {
            int number = sc.nextInt();
            array[i] = number;
        }
        findMin(array);
        return array;
    }
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        System.out.println("Min value= " + min);
        return min;
    }
    public static void main(String[] args) {
        readElement();
    }
}
