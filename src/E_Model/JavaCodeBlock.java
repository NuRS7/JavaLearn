package E_Model;

public class JavaCodeBlock {
    public static void main(String[] args) {
        int a = 10;
        {
            a++;
            System.out.println(a);

        }
        int c = 20;
        if (a == 10) {
        } else {
            c++;
            System.out.println(c);
        }
    }
}
