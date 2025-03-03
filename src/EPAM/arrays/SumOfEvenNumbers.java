package EPAM.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        if ((array == null) || (false)) {
            throw new UnsupportedOperationException();
        }
        //put your code here
        int sum = 0;
        for (int numbers : array) {
            if (numbers % 2 == 0) {
                sum += numbers;
            }
        }
        return sum;
    }
}
