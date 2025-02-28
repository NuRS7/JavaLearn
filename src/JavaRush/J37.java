package JavaRush;
import java.util.Arrays;
public class J37 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код
        Object object = array;

        if (object instanceof int[]) {
            System.out.println(true);
            Arrays.sort(array);
            int index =Arrays.binarySearch(array, element);

        } else {
            System.out.println(false);
        }



    }
}