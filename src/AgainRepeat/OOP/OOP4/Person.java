package AgainRepeat.OOP.OOP4;

public class Person {
    String name;
    protected int age;
    public String address;
    private String phone;

    Person(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }
    void displayAge() {
        System.out.println("Age: " + age);
    }
    private void displayAddress() {
        System.out.println("Address: " + address);
    }
    protected void displayPhone() {
    System.out.println("Phone: " + phone);
}
}
