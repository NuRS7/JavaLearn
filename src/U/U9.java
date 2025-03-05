package U;

import java.util.ArrayList;
import java.util.Iterator;

public class U9 {
    public static void main(String[] args) {
        ArrayList<Double> expenses = new ArrayList<>();

        expenses.add(32.3);
        expenses.add(34.3);
        expenses.add(35.3);
        expenses.add(36.3);
        expenses.remove(36.3);
        expenses.clear();

        System.out.println(expenses.isEmpty());
        expenses.add(3.3);
        expenses.add(3.4);
        System.out.println(expenses);

        System.out.println(expenses.contains(3.3));

        System.out.println(expenses.get(0));

        System.out.println(expenses.indexOf(3.3));

        System.out.println(expenses.size());
        Iterator<Double> it = expenses.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        ArrayList<String> StringArray = new ArrayList<>();
        StringArray.add("Volvo");
        StringArray.add("BMW");
        StringArray.add("Mers");
        StringArray.add("Toyoto");
        StringArray.set(2, "Hondo");
        StringArray.trimToSize();
        System.out.println(StringArray);
    }
}
