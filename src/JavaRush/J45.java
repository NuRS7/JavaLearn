package JavaRush;

public class J45 {

    public static void main(String[] args) {
        String name = "Nursultan";
        SignIn("nurs");
    }

    public static void SignIn(String username) {
        if (username == "user") {
            return;
        } else {
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
        }
    }

}
