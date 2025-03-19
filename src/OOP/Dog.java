package OOP;

public class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Eating...");
        super.eat();
    }

    public void bark() {
        System.out.println("I am barking");
    }



    public void showName() {
        System.out.println("Name is " + name);
    }
}
