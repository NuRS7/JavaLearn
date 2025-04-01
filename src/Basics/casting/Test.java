package Basics.casting;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("Nurs", 11);
        System.out.println(animal.eat());
        Animal animal2 = new Dog("Nurs", 11);
        System.out.println(animal2.getAge());
    }
}
