package JavaRush;

public class J39 {
    public static void printWifi() {
        System.out.println("WI");
    }

    public static void main(String[] args) {
        printWifi10Times();
    }

    public static void printWifi10Times() {
        for (int i = 1; i < 10; i++) {
            printWifi();

        }
    }
}
