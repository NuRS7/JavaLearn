package JavaLearnNModel;

public class N46 {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i++) {
            String str = Integer.toString(i);

            String reversedStr = new StringBuilder(str).reverse().toString();

            if (str.equals(reversedStr)) {
                System.out.println(i);

            }
        }
    }
}
