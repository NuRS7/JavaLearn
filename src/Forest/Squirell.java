package Forest;

import Forest.Test.Info;


public class Squirell implements Info {
    private String name;
    private int age;

    public Squirell(String name, int age) {
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
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
