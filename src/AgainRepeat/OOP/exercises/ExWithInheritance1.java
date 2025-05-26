package AgainRepeat.OOP.exercises;

public class ExWithInheritance1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Alik", 40);
        person1.displayInfo();
        Teacher1 teacher1 = new Teacher1("Dana", 34, "Math");
        teacher1.displayInfo();
        Student1 student1 = new Student1("Nursultan", 21, "KazNU");
        student1.displayInfo();
    }
}

class Person1 {
    String name;
    private int age;
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        }
        else this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null) {
            System.out.println("Name cannot be empty");
        }
        else this.name = name;
    }
    void displayInfo() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

class Student1 extends Person1 {
    String university;
    Student1(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }
    @Override
    void displayInfo() {
        System.out.println("Name "+ getName()+ " age " + getAge() + "university " + university);
    }
}

class Teacher1 extends Person1 {
    String subject;

    Teacher1(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println("Name "+ getName()+ " subject " + subject + " age " + getAge());
    }

}