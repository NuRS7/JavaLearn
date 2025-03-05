package U;

public class Car {
    private String model;
    private String brand;
    public Car() {
        this("CAMRY", "TOYOTO");
        System.out.println("Init");
    }

    public Car(String model) {
        this(model, "BMW");
    }

    public Car(String model, String brand) {
        this.brand = brand;
        this.model = model;
    }
}
