package AgainRepeat.OOP.Basics;

public class methods2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(sum(a, b));
        display("Tom", 12);
        sumAll(a,b,c,d);
        AllPrint("Nurs", 1, 32, 3, 4, 5, 5);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    static void display(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    static void sumAll(int... nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        System.out.println(result);
    }

    static void AllPrint(String massage, int... numbers) {
        System.out.println(massage);
        int res = 0;
        for (int num : numbers) {
            res += num;
        }
        System.out.println(res);
    }
}