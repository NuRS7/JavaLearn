package abstractClasses.skiff;

public class Buldog extends Dog implements AbleToSleep, AbleToSwim, AbleToMakeSound {
    public Buldog(String name, int age, String breed, String color, int weight, int height) {
        super(name, age, breed, color, weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("Громко лает");
    }

    @Override
    public void sleep() {
        System.out.println("Бульдог спит");
    }

    @Override
    public void swim() {
        System.out.println("Плохо плавает");
    }

    @Override
    public void eat() {
        System.out.println("Бульдог кушает");
    }
}