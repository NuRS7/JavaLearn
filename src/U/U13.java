package U;

abstract class Main {
    String fname = "Nurs";
    int age = 24;

    public abstract void method(); // abstract method
}

class Student extends Main {
    int graduateYear = 2025;
    public void method() { //the body of the abstract method is provided here
        System.out.println("Test");
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.fname);
        System.out.println(student.age);
        System.out.println(student.graduateYear);
        student.method();

    }
}

