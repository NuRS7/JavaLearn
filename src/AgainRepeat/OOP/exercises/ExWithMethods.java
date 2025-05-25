package AgainRepeat.OOP.exercises;

public class ExWithMethods {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        int result1 = math.add(1, 2);
        int result2 =math.subtract(2, 1);
        math.printResult(result1);
        math.printResult(result2);
    }
}

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }

    void printResult(int result) {
        System.out.println("Result: " + result);
    }
}
