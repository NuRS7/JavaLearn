package JavaLearnNModel;

public class N23 {
    public void time() {
        for (int chas = 0; chas <= 23; chas++) {
            for (int min = 0; min <= 59; min++) {
                System.out.println(chas + ":" + min);

            }

        }
    }

    public static void main(String[] args) {
        N23 clock = new N23();
        clock.time();
    }
}
