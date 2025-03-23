package abstractClasses.skiff;

public abstract class Dog extends Animal {
    protected String name;
    protected int age;
    protected String breed;
    protected String color;
    protected int weight;
    protected int height;

    public Dog(String name, int age, String breed, String color, int weight, int height) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
    }
}
