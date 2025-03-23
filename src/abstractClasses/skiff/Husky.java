package abstractClasses.skiff;


public class Husky extends Dog implements AbleToSleep, AbleToMakeSound, AbleToSwim {


    public Husky(String name, int age, String breed, String color, int weight, int height) {
        super(name, age, breed, color, weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("Хаски воет");
    }

    @Override
    public void sleep() {
        System.out.println("Хаски спит");
    }

    @Override
    public void swim() {
        System.out.println("Хаски умеет плавать");

    }

    @Override
    public void eat() {
        System.out.println("Хаски кушает");
    }
}
