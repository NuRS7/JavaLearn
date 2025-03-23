package abstractClasses;

public class Dog extends Animal implements AbleToMakeSound, AbleToSleep, AbleToSwim {

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void makeSound() {
        System.out.println("Gaf ghaf");
    }

    @Override
    public void swim() {
        System.out.println("Dog swim");
    }
}
