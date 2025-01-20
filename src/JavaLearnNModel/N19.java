package JavaLearnNModel;

import java.util.HashMap;

public class N19 {
    public N19(String name, String surname, int age) {

    }
    public static void main(String[] args) {
        HashMap<String, String> attr = new HashMap<>();
        N19 n19 = new N19("Nursultan", "Yerbakytuly", 21);
        n19 = new N19("Zhanna", "Yerbakytuly", 20);

        System.out.println(attr);

    }
}
