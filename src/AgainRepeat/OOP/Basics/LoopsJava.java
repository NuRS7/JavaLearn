package AgainRepeat.OOP.Basics;

public class LoopsJava {
    public static void main(String[] args) {
        int b = 10;
        int n = 10;
        for(int i=0, j = n - 1; i < j; i++, j--){

            System.out.println(i * j);
        }
        for (int i = 1; i < b; i++) {
            System.out.println(i);
        }
        for (; ; ) {
            System.out.println(b + b);
        }

    }

}

