package AgainRepeat.OOP.Basics;

public class staticClasses {
    public static void main(String[] args) {
        Test person = new Test();
        person.displayId();
        Test person2 = new Test();
        person2.displayId();
        Test person3 = new Test();
        person3.displayId();
        System.out.println(Test.counter);
        Test.counter = 9;
        Test person4 = new Test();
        person4.displayId();
        Outer.Inner outer = new Outer.Inner();
        outer.display();

    }
}

class Test {
    private int id;
    static int counter = 1;

    Test() {
        id = counter++;
    }
    public void displayId() {
        System.out.println(" "+ id);
    }
}

class Outer {
    static class Inner {
        static void display() {
            System.out.println("Nested class");
        }
    }
}