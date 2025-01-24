package JavaLearnNModel;

public class doWhileLoop7 {
    public static void main(String[] args) {
        int hour = 0;
        OUTER:
        while (hour < 24) {
            INNER:

            for (int min = 0; min < 60; min++) {

                System.out.println(hour + ":" + min
                );
            }
            hour++;
        }


    }
}
