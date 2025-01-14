public class E57 {
    public static void main(String[] args) {
        E57 e57 = new E57();
        System.out.println(e57.defineLevel("admin"));
    }
    public int defineLevel(String role) {
        var result = switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default  -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
        return result;
    }
}
