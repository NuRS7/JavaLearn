package lambda;

public class LambdaApp {

    static int x = 30;
    static int y = 70;

    public static void main(String[] args) {
        Operation operation = () -> {
            int x = 40;
            int result = x + y;
            return result;
        };
        System.out.println(operation.calculate());
        System.out.println(x);
    }
}

interface Operation {
    int calculate();
}
