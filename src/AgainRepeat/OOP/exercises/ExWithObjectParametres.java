package AgainRepeat.OOP.exercises;

public class ExWithObjectParametres {
    public static void main(String[] args) {
        Person person = new Person("Nurs", 21);
        Greeter greeter = new Greeter();
        greeter.greet(person);
    }
}

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Greeter {
        void greet(Person person) {
        System.out.println("Hello, " + person.name + "!" + " You are " + person.age + " years old.");
    }
}