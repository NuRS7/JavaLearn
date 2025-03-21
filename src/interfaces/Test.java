package interfaces;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Nurs");
        person.sayHello();
        Animal animal = new Animal(3);
        animal.sleep();
        ouputInfo(person);
        ouputInfo(animal);
    }

    public static void ouputInfo(Info info) {
        info.showInfo();
    }
}
