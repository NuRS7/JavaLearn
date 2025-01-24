package JavaLearnNModel;

public class doWhileLoop6 {
    public static void main(String[] args) {
        int hour = 0;
       OUTER: while (hour < 24) {
            int min = 0;
            INNER: while (min < 60) {
                System.out.println(hour + ":" + min);
                min++;
                if (min == 10) {

//                    continue OUTER; //бесконечный луп
                    break OUTER;  // остановить все лупы то есть 0:0-0:9


                }
            }

            hour++;

        }



    }
}
