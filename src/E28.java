import java.util.Scanner;

public class E28 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int period = sc.nextInt();

            int hours = period / 3600;

            int represents = period % 3600;

            int minute = represents / 60;

            int total_sec = represents % 60;
            System.out.println(represents);


            System.out.println("Min: " + minute);
            System.out.println(total_sec);

        }



    }


}