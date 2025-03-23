package abstractClasses;

public class Cat extends Animal {
    public void soundMake() {
        System.out.println("Moew");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
