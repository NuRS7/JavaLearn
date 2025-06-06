package AgainRepeat.OOP.Basics;

import java.util.ArrayList;

public class ArrayListsR {

    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        people.add("John");
        people.add("Jane");
        people.add("Bob");
        people.add("Mary");
        for (String person : people) {
            System.out.println(person);
        }
        people.set(1, "Nursultan");

        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {
            System.out.println(person);
        }
        System.out.println(people.size());
        System.out.println(people.get(1));
        people.remove("Nursultan");
        for (String person : people) {
            System.out.println(person);
        }
        try {
            if (people.contains("John")) {
                System.out.println("dd");
            }
        } finally {
            System.out.println(people.size());
        }
        people.trimToSize();
        people.stream().toArray();

    }
}
