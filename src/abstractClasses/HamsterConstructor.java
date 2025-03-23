package abstractClasses;

public abstract class HamsterConstructor {
    public void eat() {
        System.out.println("Hamster eats");
    }
}
interface MakingSound {
    public void makeSound();
}

abstract class SoundMakingAnimal extends HamsterConstructor implements MakingSound {
    public void makeSound() {
        System.out.println("Hamster makes sound");
    }
}

interface SwimmingAnimals {
    public void swim();
}
abstract class SwimmingAnimal extends SoundMakingAnimal implements SwimmingAnimals {
    public void swim() {
        System.out.println("Hamster swims");
    }
}

interface SleepingAnimals {
    public void sleep();
}
abstract class SleepingAnimal extends SwimmingAnimal implements SleepingAnimals {
    public void sleep() {
        System.out.println("Hamster sleeps");
    }
}

class Hamster extends SleepingAnimal {

}