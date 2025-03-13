package Basics;

public class TryCatchFinally {
    public static void main(String[] args) {

        try {
            int[] numbers = new int[3];
            numbers[4] = 3;
            System.out.println(numbers[4]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done");
    }
}
