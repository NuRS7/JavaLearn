import java.util.Scanner;

public class N1 {
    public static int max() {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (sc.hasNextInt()) {
            int currentNum = sc.nextInt();
            if (currentNum > max) {
                max = currentNum;
                break;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(max());
    }
}
