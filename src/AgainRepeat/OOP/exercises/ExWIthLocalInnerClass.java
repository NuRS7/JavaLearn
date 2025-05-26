package AgainRepeat.OOP.exercises;

public class ExWIthLocalInnerClass {
    public static void main(String[] args) {

        new Outer2().show();
    }
}

class Outer2 {

    void show() {
        int num = 5;
        class MethodInClass {
            void display() {
                System.out.println("number out these class: " + num);
            }
        }
        MethodInClass obj = new MethodInClass();
        obj.display();
    }

}
