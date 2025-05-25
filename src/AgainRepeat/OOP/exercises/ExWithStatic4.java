package AgainRepeat.OOP.exercises;

public class ExWithStatic4 {
    public static void main(String[] args) {
        Config config = new Config();
    }
}

class Config {
    static {
        System.out.println("Config initialized");
    }
}
