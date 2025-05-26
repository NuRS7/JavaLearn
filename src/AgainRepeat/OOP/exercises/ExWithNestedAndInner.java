package AgainRepeat.OOP.exercises;

public class ExWithNestedAndInner {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        Outer1 outer1 = new Outer1();
        Outer1.Innner1 innner1 = outer1.new Innner1();
        innner1.display();
    }
}

class Outer {
    static final int num = 5;
    static class Inner {
        void show() {
            System.out.println(num);
        }
    }
}

class Outer1 {
    private String massage = "Private massage";

     class Innner1 {
        void display() {
            System.out.println(massage);
        }
    }
}