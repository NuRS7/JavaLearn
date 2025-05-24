package AgainRepeat.OOP.OOP3;

public class Person {
    String personName;
    int personAge;

    Person(String personName) {
        this(personName, 13);

            }

    Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }
    Person(int personAge) {
        this("Default Person", personAge);
    }
    void display() {
        System.out.println("Person name is " + personName + " Person age is " + personAge);
    }
}
