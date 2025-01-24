package JavaLearnNModel;

public class doWhileLoop4 {
    static int hour = 0;
    public static void main(String[] args) {
        OUTER:
        do {
            int min = 0;
            INNER:
            while (min < 60) {
                System.out.println(hour + ":" + min);
                min++;
            }
            hour++;
        }
        while (hour < 24);
    }
}

