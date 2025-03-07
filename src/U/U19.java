package U;

public class U19 {
    public static void main(String[] args) {
        Adam adam1 = new Adam("Nurs", 13);
        adam1.getName();
        adam1.getAge();
        System.out.println(adam1.getName()+" "+adam1.getAge());
        Adam adam2 = new Adam("Sultan", 1);
        System.out.println(adam2.getName());
        Adam adam3 = new Adam();
        System.out.println(adam3.getName()+" "+adam3.getAge());
    }
} //Перегрузка методов можно использовать несколько раз в этом случае method Adam
// 1. Можно не передавать свойство 2. Только можно передавать строка 3. Только цифру 4. Все параметры можно передать
class Adam {
    private String name;
    private int age;
    public Adam() {
        System.out.println("Первый конструктор");

    }

    public Adam(String name) {
        this.name = name;
    }

    public Adam(int age) {
        this.age = age;
    }
    public Adam(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}