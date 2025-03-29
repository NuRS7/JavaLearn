package abstractClasses.javaAbstract;

public class Program {
    public static void main(String[] args) {
        Human human = new Human("Nursultan", 21);
        System.out.println(human.getAge());
        System.out.println(human.getName());
    }
}
