package E_Model;

import java.util.Scanner;

public class E88 {
    public static void main(String[] args) {
        String[] inputMessages = readInput();
        String message1, message2;
        message1 = inputMessages[0];
        message2 = inputMessages[1];
        StringBuilder correct = new StringBuilder(message1.concat(message2));
        correct.insert(message2.length(), " ");
        String result = correct.toString();
        System.out.println(result);
    }

    public static String[] readInput() {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();

        return inputLine.split(" \\| ");
    }
}