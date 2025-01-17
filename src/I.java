import java.util.Scanner;

public interface I {
     static void main(String[] args) {
        String str = new String("Hello World");
        System.out.println(str);
    }
    Scanner sv = new Scanner(System.in);
    int a = sv.nextInt();
    int b = sv.nextInt();

    static int add(int a, int b) {
        int c = add(a, b);
        System.out.println(c);
        return a + b;

    }


}
