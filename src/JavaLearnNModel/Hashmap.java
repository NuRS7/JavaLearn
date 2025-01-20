package JavaLearnNModel;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap();
        map.put("Mercedes", 1);
        map.put("BMW", 2);

        map.compute("Mercedes", (key, value) -> value + 3);
        System.out.println(map);


    }


}
