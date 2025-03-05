package U;

public class U17 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Nursultan";
        person.age = 18;
        person.pol = "Male";
        System.out.println(person.name +" "+ person.age +" "+ person.pol);
    }

}

class Person {
    String name;
    int age;
    String pol;
}
