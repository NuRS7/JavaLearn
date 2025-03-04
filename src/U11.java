import java.util.ArrayList;
import java.util.HashMap;

public class U11 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> orders = new HashMap<>();
        ArrayList<Integer> orderNum = new ArrayList<>();
        orderNum.add(3);
        orderNum.add(5);
        orderNum.add(4);
        orders.put("Костя", orderNum);


        orderNum = new ArrayList<>();
        orderNum.add(5);
        orderNum.add(9);
        orderNum.add(8);
        orderNum.add(10);

        orders.put("Ольга", orderNum);

        ArrayList<Integer> custemerOrder = orders.get("Костя");
        for (int i : custemerOrder) {
            System.out.println("№" + i);
        }

    }
}
