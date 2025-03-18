package P1;

public class Program3 {
    public static void main(String[] args) {
        Person3 person3 = new Person3();
        person3.display();
    }
}
class Person3  {
    String name;
    int age;
Person3() {
    name = "K";
    age = 29;
}
    Person3(String name) {
        this(name, 18);
    }
    Person3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name: " + name+" Age: " + age);
    }
}
