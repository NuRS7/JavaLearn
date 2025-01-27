package JavaLearnNModel;

import java.util.Scanner;

public class N89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if (n.length()%2 != 0) {

        }
        long mid = n.length() / 2;
        String left = n.substring(0, (int) mid);
        String right = n.substring((int) mid);
        right = right.replaceFirst("^00", "");
        System.out.println(left+ " "+ right);

    }
}
