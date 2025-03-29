package GenericsBasic;

public class Program {
    public static void main(String[] args) {
        Person person = new Person(1,"Nurs");
        int result;
        result = (int) person.getId();
        System.out.println(result);
        Person person2 = new Person("123", "Nurs");
        int result2 = (int) person2.getId();
        System.out.println(result2);
    }


}

class Person {
    private Object id;
    private String name;

    public Person(Object id, String name) {
        this.name = name;
        this.id = id;
    }
    public void setId(Object id) {
        this.id = id;
    }
    public Object getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
