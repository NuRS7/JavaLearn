import java.util.Scanner;

public class E92 {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        //put you code here
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        if (PASSWORD == password) {
            System.out.println("Hello, Agent");

        } else {
            System.out.println("Access denied");

        }


    }
}
