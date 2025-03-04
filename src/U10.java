import java.util.ArrayList;
import java.util.HashMap;

public class U10 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashTable = new HashMap<Integer, String>();
        hashTable.put(1, "KZ");
        hashTable.put(2, "UZ");
        System.out.println(hashTable);


        HashMap<String, String> officeTool = new HashMap<String, String>();
        officeTool.put("P342", "Черно белый принтер из кооридора");
        System.out.println(officeTool);
        //{P342=Черно белый принтер из кооридора}
        officeTool.put("P342", "Принтер из офиса 42");
        //{P342=Принтер из офиса 42}
        System.out.println(officeTool);

        HashMap<String, ArrayList<Double>> menu = new HashMap<>();
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(350.0);
        prices.add(351.0);
        prices.add(352.0);
        prices.add(353.0);
        menu.put("Коктейл", prices);
        System.out.println(menu);
        //{Коктейл=[350.0, 351.0, 352.0, 353.0]}
        ArrayList<Double> mohitoPrice = new ArrayList<>();
        mohitoPrice.add(350.0);
        mohitoPrice.add(250.0);
        mohitoPrice.add(150.0);
        mohitoPrice.add(50.0);
        menu.put("Мохито", mohitoPrice);
        System.out.println(menu);
        //{Мохито=[350.0, 250.0, 150.0, 50.0], Коктейл=[350.0, 351.0, 352.0, 353.0]}
        HashMap<String, HashMap<Double, String>> allMenu = new HashMap<>();
        HashMap<Double, String> priceAll = new HashMap<>();
        priceAll.put(3.0, "$");
        priceAll.put(5.0, "T");
        priceAll.put(4.0, "Euro");
        allMenu.put("Кола", priceAll);
//        {Кола={4.0=Euro, 5.0=T, 3.0=$}}

        System.out.println(allMenu);

    }
}
