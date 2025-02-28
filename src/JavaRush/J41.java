package JavaRush;

public class J41 {
    public static void PersonInfo(String name, String surname, String meal) {
        System.out.println("Краткое досье:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Любимое блюдо: " + meal);
    }

    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        PersonInfo(firstName, lastName, favouriteDish); // отдельно переписали все равно радотает потому что
        // оно подходит все параметрам в методе PersonInfo();
    }
}
