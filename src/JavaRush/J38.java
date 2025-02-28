package JavaRush;

import java.util.Arrays;
import java.util.Scanner;
public class J38 {
    public static String[] strings;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
            System.out.println(Arrays.toString(strings));
        }

        for (int i =0;i<strings.length;i++) {
            String current = strings[i];
            for (int j = i+1;j<strings.length;j++) {
                if (current == null) {
                    break;
                }
                if (current.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;


                }
            }

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]+", ");

        }
    }

}
