package E_Model;

public class E54 {
    public static void main(String[] args) {
        E54 e54 = new E54();
        System.out.println(e54.defineLevel("3"));
    }
    public int defineLevel(String role) {
        return switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
    }
}
