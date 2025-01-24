package JavaLearnNModel;

public class doWhileLoop5 {
    public static void main(String[] args) {
        int hour = 0;
        OUTER:
        for (hour = 0; hour < 24; hour++) {
            int min = 0;
          INNER:
          while (min < 60) {
                System.out.println(hour+ ":"+ min);
                min++;
            }

        }
    }
}
