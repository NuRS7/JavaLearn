package JavaRush;

public class J8 {
    public static void main(String[] args) {
        int start = 1;
        int end = 30;
        int multiple = 3;
        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;

            }
            sum += i;

        }
        System.out.println(sum);
    }
}
