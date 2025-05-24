package AgainRepeat.OOP.Basics;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person("Q",12);
        person.name = "Nurs";
        person.age = 21;
        person.sayHello();
        person.speak();
        Action action = new Action("Mu", 11);
        action.show(action.name = "nurs", action.age = 21);
    }


}

class Person {
    String name;
    int age;
    void speak() {
        System.out.println("Voice");
    }
    void sayHello() {
        System.out.println("Hello "+ this.name+ " age "+ this.age);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


    class Action extends Person {
    Action(String name, int age) {
        super(name, age);

    }

        public void show(String name, int age) {
            System.out.println(name+" "+ age);
        }
    }


