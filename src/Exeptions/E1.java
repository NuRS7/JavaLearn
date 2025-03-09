package Exeptions;

public class E1 {
    public static void main(String[] args) throws Exception {
        int a = 20;
        getFactorial(a);
    }
    public static int getFactorial(int num) throws Exception {

        if (num < 1) throw new Exception("The number is less than 1");
        int result = 1;
        for (int i = 1; i <= num; i++) {

            result *= i;
        }
        System.out.println(result);
        return result;
    }
}

