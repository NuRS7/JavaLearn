package AgainRepeat.OOP.Basics;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[3];
            numbers[4] = 45;
            System.out.println(numbers[4]);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            System.out.println("Well done");
        }
    }
}
