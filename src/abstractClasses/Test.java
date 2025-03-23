package abstractClasses;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.soundMake();
        cat.sleep();


        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();
        dog.swim();

        Hamster hamster = new Hamster();
        hamster.eat();
        hamster.sleep();
        hamster.makeSound();
        hamster.swim();

    }
}
