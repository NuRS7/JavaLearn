package P1;

public class Program2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.displayShow();
        Person2 person3 = new Person2("Nurs", 23);
        person3.displayShow();
    }
}

class Person2 {
    String name;
    int age;

    Person2() {
        this("underfined", 18);
    }

    Person2(String name) {
        this(name, 18);
    }
    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayShow() {
        System.out.println("Name: " + name+" "+ "Age: " + age);
    }

}
