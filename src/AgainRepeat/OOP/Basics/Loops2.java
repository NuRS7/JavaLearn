package AgainRepeat.OOP.Basics;

public class Loops2 {
    public static void main(String[] args) {
        int j = 20;
        do {
            System.out.println(j);
            j--;

        }
        while (j > 0);
        int a = 6;
        while (a > 0) {
            System.out.println(a);
            a--;
        }
        System.out.println("===============================");

        for (int i = 5; i < 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("=================");
        for (int d = 3; d < 9; d++) {
            if (d == 6) {
                continue;
            }
            System.out.println(d);
        }
    }






}
