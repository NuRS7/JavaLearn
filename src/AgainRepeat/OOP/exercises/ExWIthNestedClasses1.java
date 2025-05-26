package AgainRepeat.OOP.exercises;

public class ExWIthNestedClasses1 {
    public static void main(String[] args) {
        Laptop.brand = "Asus ROG";
        Laptop.price = 10000.0;
        Laptop.Battery laptop = new Laptop.Battery(100, "Game's");
        laptop.display();
    }
}

class Laptop {

    static String brand;
    static double price;

    static class Battery {
        int capacity;
        String type;

        Battery(int capacity, String type) {
            this.capacity = capacity;
            this.type = type;
        }

        void display() {
            System.out.println("Brand: " + brand +
                    " price " + price + " capacity " + capacity
                    + " type " + type
            );

        }

    }

}
