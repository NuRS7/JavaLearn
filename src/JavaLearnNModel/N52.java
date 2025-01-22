package JavaLearnNModel;

public class N52 {
    public static void main(String[] args) {
        boolean b = true;
        int a = 1;
        while (b) {
            System.out.println(a);
            if (a % 3 == 0 && a % 7 == 0) {
                b = false;
                break;
            }
            a++;
//21 3 ке де 7 геде болинеди и b = false ;

        }
    }
}
