package JavaLearnNModel;

public class N20 {
    public static void main(String[] args) {
        int a = 15;
        if (a > 10) {
            for (int i = 0; i < 10; i++) {
                if (i == 7) {
                    continue;
                }
                System.out.println(i);
            }
            System.out.println("Hello");
        }
    }
}
