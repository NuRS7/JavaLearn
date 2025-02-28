package JavaRush;

public class J42 {
    public static void printMonth(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum = sum + data[i];
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int[] monthDay = new int[]{1, 2, 3, 4, 5, 6, 7};
        printMonth(monthDay);
    }
}
