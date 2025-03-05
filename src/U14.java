public class U14 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(21);
        human1.setName("Nurs");
        human1.getInfo();

    }
}
class Human {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getInfo() {
        System.out.println(name + " " + age);
    }
}

