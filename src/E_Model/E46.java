package E_Model;

public class E46 {
    public static void main(String[] args) {
        int i = 0;
        outer:
        while (i++ < 5) {
            int j = 0;
            while (j++ < 2) {
                if (i== 2) {
                    continue outer;

                }
                System.out.println("i= "+ i +" "+"j =" + j);
            }

        }


    }
}