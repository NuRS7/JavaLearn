import java.util.Arrays;

public class U5 {
    public static int[] sortedArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Array sorted: ");
        System.out.println(Arrays.toString(array));
        revedsedArray(array);

        return array;
    }

    public static int[] revedsedArray(int[] array) {
        int maxIndex = array.length - 1;
        int halfArrayLength = array.length / 2;
        for (int i = 0; i < halfArrayLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed ArrayList");
        System.out.println(Arrays.toString(array));
        reversedCopy(array);
        return array;
    }
    public static int[] reversedCopy(int[] array) {
        int[] reversedSort = new int[array.length];

        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedSort[maxIndex--] = el;

        }
        System.out.println("Reversed sorted Array: ");
        System.out.println(Arrays.toString(reversedSort));

        return reversedSort;
    }

    public static void main(String[] args) {
        int[] array = {1, 23, 43, 4, 45, 3, 2, 1};
        sortedArray(array);
    }
}
