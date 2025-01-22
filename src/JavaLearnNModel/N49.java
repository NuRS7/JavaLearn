package JavaLearnNModel;

public class N49 {
    static void time() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    break MIDDLE;
                }
                INNER:
                for (int sec = 0; sec < 60; sec++) {
                    if (sec * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour+ ":"+ minute+ ":" + sec);


                }
            }

        }
    }

    public static void main(String[] args) {
        time();
    }
}

