import java.util.Scanner;
public class E61 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int area1 = x1 * y1;
            int area2 = x2 * y2;
            if (area2 == area1) {
                System.out.println(0);

            } else if (area2 < area1) {
                System.out.println(1);

            } else {
                System.out.println(-1);
            }

        }

    }
}
