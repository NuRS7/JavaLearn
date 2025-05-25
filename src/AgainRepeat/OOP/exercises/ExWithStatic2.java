package AgainRepeat.OOP.exercises;

public class ExWithStatic2 {
    public static void main(String[] args) {
        int a = Calculator.multiply(30, 40);
        System.out.println(a);
        Calculator calculator = new Calculator(30, 42);
        calculator.show();

    }
}

class Calculator {
    int a;
    int b;
    static int multiply(int a, int b) {
        return a * b;
    }
    Calculator(int a , int b) {
        this.a = a;
        this.b = b;
    }
    void show() {
        System.out.println(a * b);
    }
}
