package AgainRepeat.OOP.exercises;

public class ExWithPolymorphism2 {
    public static void main(String[] args) {
        EnglishGreeter englishGreeter = new EnglishGreeter();
        englishGreeter.sayHello();
        RussianGreeter russianGreeter = new RussianGreeter();
        russianGreeter.sayHello();
        KazakhGreeter kazakhGreeter = new KazakhGreeter();
        kazakhGreeter.sayHello();

        GreeterInterface[] interfaces = {
                new EnglishGreeter(),
                new RussianGreeter(),
                new KazakhGreeter(),
        };

        for (GreeterInterface greeter : interfaces) {
            greeter.sayHello();
        }
    }
}

interface GreeterInterface {
    void sayHello();
}


class EnglishGreeter implements GreeterInterface {
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}
class RussianGreeter implements GreeterInterface {
    @Override
    public void sayHello() {
        System.out.println("Привет!");
    }
}
class KazakhGreeter implements GreeterInterface {
    public void sayHello() {
        System.out.println("Сәлем!");
    }
}