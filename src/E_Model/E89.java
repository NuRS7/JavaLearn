package E_Model;

import java.util.Scanner;

public class E89 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine();
        int level = defineLevel(role);

        System.out.println(" ");
        System.out.println("Уровень доступа для роли '" + role + "': " + level);
    }

    public static int defineLevel(String role) {

        int level;

        switch (role) {
            case "guest" -> {
                level = 0;
                break;
            }
            case "client" -> {
                level = 1;
                break;

            }
            case "admin" -> {
                level = 2;
                break;

            }
            default -> level = 3;
        }

        return level;
    }

}