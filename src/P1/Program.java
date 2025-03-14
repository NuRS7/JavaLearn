package P1;

public class Program {
    public static void main(String[] args) {
        Person person = new Person();
        person.display();
    }
}
class Person{
    String name;
    int age;
        Person()
    {
        name = "unknown";
        age = 18;
    }
    Person(String n)
    {
        name = n;
        int age = 21;

    }

    Person(String n, int i) {
        name = n;
        age = i;
    }
    void display() {
            System.out.println("Name: " + name+" Age: " + age);
        }
}