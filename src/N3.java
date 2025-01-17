import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int currentNum = 0;
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            currentNum = sc.nextInt();
            if (currentNum > max) {
                max = currentNum;
                break;
            }
        }
        System.out.println(max);}}
