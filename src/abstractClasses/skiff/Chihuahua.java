package abstractClasses.skiff;

public class Chihuahua extends Dog implements AbleToMakeSound, AbleToSleep {


    public Chihuahua(String name, int age, String breed, String color, int weight, int height) {
        super(name, age, breed, color, weight, height);
    }

    @Override
    public void makeSound() {
        System.out.println("Chihuahua лает тонким голосом");
    }

    @Override
    public void sleep() {
        System.out.println("Chihuahua спит");
    }

    @Override
    public void eat() {
        System.out.println("Чихуахуа кушает");
    }
}
