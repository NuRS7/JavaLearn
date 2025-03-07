package U;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListBasic {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Mers");
        list.add("Mazda");
        list.add("Ferari");
        System.out.println(list); //[Mers, Mazda, Ferari]
        System.out.println(list.removeFirst()); //Deleting first element from list1 [Mazda, Ferari]

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Alex");
        list2.addAll(list);
        System.out.println(list2); //Adding with method addAll list+list2 [Alex, Mazda, Ferari]

        list2.removeFirstOccurrence("Alex");
        System.out.println(list2);
        System.out.println(list.removeLast()); //Ferari was last element of LinkedList we are deleteed it

        list2.addFirst("Nurs"); //Adding first element "Nurs" with method addFirst
        System.out.println(list2);


        list2.addLast("Astana");
        System.out.println(list2); //Adding last element in LinkedList

        System.out.println(list2.indexOf("Nurs")); //Searching elements from LinkedList on index

        System.out.println(list.contains("nurs")); //Searching elements from LinkedList true/ false
        //

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(1);
        list3.add(3);
        list3.add(54);
        list3.add(10);
        Iterator<Integer> iterator = list3.descendingIterator(); //this method will reverse list in LinkedList

        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        list3.remove(2); //Delete 2 nd element from LinkdeList
        System.out.println(list3);


        System.out.println(list3.poll());
        System.out.println(list3);

        System.out.println(list3.offerFirst(4)); //Добавляет первый элемент
        list3.offerLast(5); // Добавляет элемент конце списка
        System.out.println(list3);
    }
}
