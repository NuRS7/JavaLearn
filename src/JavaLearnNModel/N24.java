package JavaLearnNModel;

public class N24 {
    public static void main(String[] args) {

        outer:for (int chas = 0; chas <= 23; chas++) {
           inner: for (int min = 0; min <= 59; min++) {
                if (min == 30) {
                    break outer;
                }
                System.out.println(chas + ":" + min);
            }
        }
    }
}
