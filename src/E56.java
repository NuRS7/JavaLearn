public class E56 {

    public static void main(String[] args) {
        var value = 40;
        int result  = method(value);
        System.out.println(result);

    }

    public static int method(int value) {
        return switch (value) {
            case 10 -> value * 2;
            case 20 -> value * 4;
            case 30 -> value * 3;
            default -> {
                yield value += 100;
            }
        };
    }
}