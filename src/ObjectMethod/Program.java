package ObjectMethod;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Nurs");
        Person man = new Person("Nurs");
        System.out.println(person.toString());
        System.out.println(person.hashCode());
        System.out.println(person.getClass());
        System.out.println(person.equals(man));
    }
}
