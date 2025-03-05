package U;

import java.util.Locale;
import java.util.Scanner;

public class U12 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner("Hi")) {
            sc.useLocale(new Locale("en", "US"));
            System.out.println(sc.nextLine());

        }



    }
}
