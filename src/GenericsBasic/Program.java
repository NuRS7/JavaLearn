package GenericsBasic;

public class Program {
    public static void main(String[] args) {
        Person person = new Person(1,"Nurs");
        int result;
        result = (int) person.getId();
        System.out.println(result);
        Person<String> person2 = new Person<>("123", "Nurs");
        System.out.println(person2.getId());
        Person<Integer> person3 = new Person<>(123, "Nurs");
        System.out.println(person3.getId());
    }


}

class Person<T> {
    private T id;
    private String name;

    public Person(T id, String name) {
        this.name = name;
        this.id = id;
    }
    public void setId(T id) {
        this.id = id;
    }
    public T getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
