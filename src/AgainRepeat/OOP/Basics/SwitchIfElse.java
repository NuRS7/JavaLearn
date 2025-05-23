package AgainRepeat.OOP.Basics;

public class SwitchIfElse {
    public static void main(String[] args) {

        int num = 8;
        switch (num) {
            case 1 -> {
                System.out.println("Равен на 1");

                break;
            }
            case 8 -> {
                System.out.println("Равен на 8");
                num++;
                break;
            }
            case 9 -> {
                System.out.println("Равен на 9");
                break;
            }
            default -> System.out.println("Ни равен на 1,8,9");
        }
    }
}
