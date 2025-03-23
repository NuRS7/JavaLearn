package abstractClasses.skiff;

public class Test {
    public static void main(String[] args) {
        Chihuahua chihuahua = new Chihuahua("N", 12, "Chihuahua", "White", 12, 12);
        chihuahua.displayInfo();
        Husky husky = new Husky("M.", 13, "Husky", "Black", 13, 12);
        husky.displayInfo();

        Buldog buldog = new Buldog("S", 15, "Buldog", "Yellow", 13, 14);
        buldog.displayInfo();
    }
}
