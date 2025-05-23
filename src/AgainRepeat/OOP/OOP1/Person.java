package AgainRepeat.OOP.OOP1;


class Test {
    public static void main(String[] args) {
        Person person = new Person("Nurs", 1);
        person.print();
        Person person2 = new Employee("Nurs", 12, "KZ");
        person2.print();
        Person person3 = new Client("Nurs", 13, "KZ", 133);
        person3.print();
    }
}
public class Person implements PrintAll {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void print() {
        System.out.println("Name: " + name+", Age: " + age);
    }
}

class Employee extends Person implements PrintAll {
    String company;

    Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
    @Override
    public void print() {
        System.out.println("Name: " + name+", Age: " + age+", Company: " + company);
    }
}

class Client extends Employee implements PrintAll {
    int sum;
    Client(String name, int age, String company, int sum) {
        super(name, age, company);
        this.sum = sum;
    }
    public void print() {
        System.out.println("Name: " + name+", Age: " + age+", Company: " + company+", Sum: " + sum);
    }
}
interface PrintAll {
    void print();
}
