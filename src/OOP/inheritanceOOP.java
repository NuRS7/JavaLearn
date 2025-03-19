package OOP;

public class inheritanceOOP {
    public static void main(String[] args) {
        Person person = new Person("Nurs");
        person.display();
        Employer employer = new Employer("Nurss", "Google");
        employer.display();
    }

}
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void display() {
        System.out.println("name is " + name);
    }
}

class Employer extends Person {
    String company;

    public String getCompany() {
        return company;
    }

    public Employer(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("company:" + getCompany());
    }
}

