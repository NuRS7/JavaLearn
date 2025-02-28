public class U2 {
    public static void main(String... args) {
        System.out.println("Hello World again");
        String[] textlist = {"Hello", "World", "again"};
        String[] spittext = "Hello Kazakhstan".split(" ");
        printText(spittext);
        System.out.println("_".repeat(20));
        printText("Kazakhstan", "is", "a", "beautiful", "country");
        printText(textlist);
        System.out.println("_".repeat(20));
        int[] numArr = {1, 2, 3, 4};
        printInteger(numArr);
        System.out.println("_".repeat(20));
        printInteger(1, 2, 3, 4, 5);
        System.out.println("___".repeat(30));
        String[] valueArr = {"Hello", "World", "again"};
        System.out.println(String.join(", ", valueArr));
        printText(valueArr);
    }

    private static void printText(String... textlist) {
        for (String text : textlist) {

            System.out.println(text);
        }
    }

    private static void printInteger(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);

        }
    }


}
