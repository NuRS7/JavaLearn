package AgainRepeat.OOP.exercises;

public class ExWithStatic {
    public static void main(String[] args) {
        User user = new User("Nurs");
        user.display();
        User user1 = new User("Alisher");
        user1.display();
    }
}

class User {
    String name;
    int id;
    static int count = 0;

    public User(String name) {
        this.name = name;
        count++;
        id = count;
    }
    void display() {
        System.out.println(id + " " + name);
    }
}
