import java.util.Scanner;

public class E31 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int input_data = sc.nextInt();


            int a = input_data / 1000;  // Первая цифра
            System.out.println(a);
            int b = input_data % 1000 / 100;  // Вторая цифра
            System.out.println(b);
            int c = input_data % 100 / 10;  // Третья цифра
            System.out.println(c);
            int d = input_data % 10;  // Четвертая цифра
            System.out.println(d);
        }
    }
}
