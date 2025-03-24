package modificator;

import java.util.ArrayList;

public class Person {
    private final ArrayList<Person> friends = new ArrayList<Person>();
    public ArrayList<Person> getFriends() {
        return friends;
    }

    public void addFriend(Person friend) {
        friends.add(friend);
    }
}

class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person2.addFriend(person1);
        person3.addFriend(person2);
        System.out.println(person3.getFriends());
    }
}
