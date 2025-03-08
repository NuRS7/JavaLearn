package Basics;

import java.util.ArrayDeque;

public class ArrayDequesBasic {
    public static void main(String[] args) {
        ArrayDeque<String> string = new ArrayDeque<>();
        string.add("Germany");
        string.add("France");
        string.add("Great Britain");
        string.add("Kazakhstan");
        string.add("Italy");

        String sFirst = string.getFirst(); // We are got a first element from ArrayDeque
        System.out.println(sFirst);

        String sLast = string.getLast();
        System.out.println(sLast); // Got last element

        System.out.println(string); //[Germany, France, Great Britain, Kazakhstan, Italy]

        System.out.println("Deques size: " + string.size()); //Deques size: 5

        while (string.peek() == null) {
            System.out.println(string.pop());
        }

        ArrayDeque<PeopleAdam> people = new ArrayDeque<>();


        System.out.println("----------");
        people.addFirst(new PeopleAdam("Adilkhan"));
        people.addLast(new PeopleAdam("Nurs"));

        for (PeopleAdam p : people) {
            System.out.println(p.getName());
        }
        System.out.println("----------");


    }
}

class PeopleAdam {

    private String name;

    public PeopleAdam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
