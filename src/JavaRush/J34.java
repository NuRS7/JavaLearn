package JavaRush;

public class J34 {
    public static void email(String email) {
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < email.length() - 1) {
            a = email.indexOf("@", a);
            b = email.indexOf(".", b);
            c = email.indexOf(";", c + 1);
            System.out.println(email.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        J34 obj = new J34();
        obj.email("jerry@mail.ru; nursultan@gmil.com; toyoto@yahoo.com;");
    }
}