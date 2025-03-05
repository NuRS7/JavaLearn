package U;

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


        System.out.println("---------------------------------------");

        HashMap<String, String> hashTable = new HashMap<>();
        hashTable.put("1", "M");
        hashTable.put("2", "J");
        hashTable.put("3", "K");
        hashTable.put("4", "N");

        for (String s : hashTable.values()) {
            if (s.equals("N")) {
                System.out.println(s);


            }



        }

        HashMap<String, String> capitalies = new HashMap<>();
        capitalies.put("England", "London");
        capitalies.put("Germany", "Berlin");
        capitalies.put("Kazakhstan", "Astana");
        HashMap<String, String> moreCapitalies = new HashMap<>();
        moreCapitalies.put("Canda", "Ottowa");
        moreCapitalies.put("Japan", "Tokyo");

        moreCapitalies.replace("England", "Berlin", "London"); // replace public boolean replace(k key, old value, new value)

        System.out.println(moreCapitalies);

        System.out.println("--------------------");


        System.out.println(moreCapitalies.getOrDefault("Japan", "Unknown")); //Tokyo
        System.out.println("--------------------");

        moreCapitalies.putAll(capitalies);
        System.out.println(moreCapitalies); // {Canda=Ottowa, Japan=Tokyo, England=London, Kazakhstan=Astana, Germany=Berlin}

        moreCapitalies.replaceAll((k,v) ->"The capital of"+k+" is "+ v);
        System.out.println(moreCapitalies); //{Canda=The capital ofCanda is Ottowa, Japan=The capital ofJapan is Tokyo, England=The capital ofEngland is London, Kazakhstan=The capital ofKazakhstan is Astana, Germany=The capital ofGermany is Berlin}


        System.out.println("=========================");

        System.out.println(moreCapitalies.entrySet()); // return as List




    }
}
