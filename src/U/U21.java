package U;

import java.util.ArrayList;
import java.util.List;

public class U21 {
    public static void main(String[] args) {
        final List<Integer> incomeBook = new ArrayList<>();
        System.out.println(incomeBook);
        incomeBook.add(3400);
        incomeBook.add(3500);
        incomeBook.add(3500);
        incomeBook.remove(0);
        System.out.println(sum(incomeBook));
    }

    public static int sum(List<Integer> incomeBook) {
        int sum = 0;
        for (int i : incomeBook) {
            sum = i + sum;
        }
        return sum;
    }
}
