public class E45 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {
            if (i == 4 && i == 8) {
                continue;
            }
            System.out.println(i);
        }
    }

}
