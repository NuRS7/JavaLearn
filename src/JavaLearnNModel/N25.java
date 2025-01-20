package JavaLearnNModel;

public class N25 {
    static void time() {
       hour: for (int hour = 0; hour <=6; hour++) {
         min:   for (int minute = 0; minute <= 59; minute++) {
              sec:  for( int second = 0; second <= 59; second++) {
                    if (hour > 1 && minute % 10 == 0) {
                        break;
                    }
                    if (second * hour > minute) {
                        continue min;
                    }
                  System.out.println(hour+":" + minute + ":" + second);
                }
            }

        }
    }

    public static void main(String[] args) {
        N25 clock = new N25();
        clock.time();
    }
}

