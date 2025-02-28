package E_Model;

public class T11   {
    public static void main(String[] args) {
        int p = 0;
        for (int i = 1; i < 100; i= i*2) {
            p++;
            for (int j = 1; j < p; j=j*2) {

                System.out.println("i: " + i + ", j: " + j+" p:"+p);
            }
        };
    }
}
