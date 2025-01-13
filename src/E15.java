public class E15 {
    public static void main(String[] args) {
        String str = "Hello World!";
        int name_len = str.length();
        int name_le = str.replace(" ", "").length();
        System.out.println(name_le);
        System.out.println(name_len);
        boolean result = str.length()>0;
        System.out.println(result);
    }
}
