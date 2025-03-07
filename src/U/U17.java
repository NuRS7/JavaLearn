package U;

public class U17 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(18);
        person.setPol("Male");
        person.speak();
        person.sayHello();
        person.validator();
        System.out.println("---------------------------");
        System.out.println(person.getName());
        System.out.println("---------------------------");
        display();

        Person person2 = new Person();
        person2.setName("Nursultan");
        person2.setAge(21);
        person2.setPol("Male");
        person2.validator();
        person2.validator();
        display();


        Person person3 = new Person();
        person3.setNameAndAgeAndPol("Inkar", 19, "Female");
        person3.speak();
        person3.sayHello();

        Person person4 = new Person();
        person4.setNameAndAgeAndPol("John", 5, "Male");
        person4.validator();


    }
    public static void display() {
        System.out.println(new Person().getName() + " " + new Person().getAge() + " " + new Person().getPol());
    }

}

class Person {
    private String name;
    private int age;
    private String pol;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPol(String pol) {
        this.pol = pol;
    }

    public void setNameAndAgeAndPol(String username, int userage, String polL) {
        name = username;
        age = userage;
        pol = polL;
    }

    public String getPol() {
        return pol;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    int getYears() {
        int years = 65 - age;
        return years;
    }
    // person.speak() call object
    void speak() {
        getYears();
        System.out.println("My name is " + name + " " + age + " " + pol+" " + getYears());
    }

    void sayHello() {
        if (pol.equals("Female")) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello, Ms." + name);
            }

        }
        else {
            System.out.println("Hello, Mr." + name);
        }
    }

    void validator() {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (pol.isEmpty()) {
            throw new IllegalArgumentException("Pool cannot be empty");
        }
        speak();
        sayHello();

    }
}
