import java.util.Arrays;
import java.util.Random;

public class U4 {
    public static void reversedArray(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Arrays after");
        System.out.println(Arrays.toString(array));

    }

    public static void sortedArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Arrays sorted and reversed");
        reversedArray(array);
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Arrays before");
        System.out.println(Arrays.toString(arr));
        reversedArray(arr);
//        sortedArray(arr);
    }
}
