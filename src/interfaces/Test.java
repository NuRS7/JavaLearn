package interfaces;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Nurs");
        person.sayHello();
        person.showInfo();

        Animal animal = new Animal(3);
        animal.sleep();
        animal.showInfo();
    }
}
