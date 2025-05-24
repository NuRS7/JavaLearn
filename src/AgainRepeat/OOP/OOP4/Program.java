package AgainRepeat.OOP.OOP4;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("Nurs", 21, "Astana", "874714240");
        person.displayAge();
        person.displayPhone();
        person.displayName();

        System.out.println(person.address);
        System.out.println();
    }
}
