package AgainRepeat.OOP.Basics;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[3];
            numbers[6] = 70;
            numbers[6] = Integer.parseInt("gdw");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException exception) {
            System.out.println("NumberFormatException");
        }
    }
}
