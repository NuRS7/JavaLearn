package E_Model;

public class E50 {
    public static void main(String[] args) {
        int i = 5;
        while (i-- > 0) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}
