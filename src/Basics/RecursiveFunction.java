package Basics;

public class RecursiveFunction {

    static int factorial(int x) {

        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }
    static void countdown(int n) {
        if (n ==0 ) {
            System.out.println("Start");
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);

    }

    static int factorialTail(int n, int result) {
        if (n == 1) {
            return result;
        }
        System.out.println("Это хвостая рекурция");
        return n * factorialTail(n - 1, result);// Последняя операция — вызов функции

    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        countdown(5);
        System.out.println(fibonacci(6));
        System.out.println(factorialTail(6, 3));
    }
}
