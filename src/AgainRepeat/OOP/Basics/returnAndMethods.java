package AgainRepeat.OOP.Basics;

public class returnAndMethods {
    public static void main(String[] args) {
        System.out.println(searching(3));

    }

    static String searching(int hours) { //Возвращает строка а принимает в качестве аргумента число целое
        switch (hours) {
            case 1 -> {
                return "1 hours";
            }
            case 2 -> {
                return "2 hours";
            }
            case 3 -> {
                return "3 hours";
            }
            case 4 -> {
                return "4 hours";
            }
            default -> {
                return "Default";
            }
        }
    }
}
