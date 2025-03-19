package OOP;

public class Cat {
    String name;
    private String phone;
    protected int age;
    public String address;

    public Cat(String name, String phone, int age, String address) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.address = address;
    }


    public void displayName() {
        System.out.println("Name" + name);
    }
    void displayAge() {
        System.out.println("Age" + age);
    }
    private void displayAddress() {
        System.out.println("Address" + address);
    }
    protected void displayPhone() {
        System.out.println("Phone" + phone);
    }
}
