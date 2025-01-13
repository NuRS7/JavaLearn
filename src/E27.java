import java.util.Scanner;


public class E27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int period = sc.nextInt();
        int hours = period/3600;

        int represents = period - 3600 * 2;

        int minutes = represents/60;

        int represents1 = represents - 60 * minutes;


        System.out.println(hours +" " +minutes+" "+ represents1);


        System.out.println(represents);

    }



}
