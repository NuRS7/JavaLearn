package EPAM.arrays;

public class MaxMethod {
    public static int max(int[] values) {
        if ((values == null) || false) {
            throw new UnsupportedOperationException();
        }
        int maxValue = values[0];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] vals = new int[]{-2, 0, 10, 5};
        int result = max(vals);
        System.out.println(result);
    }
}
