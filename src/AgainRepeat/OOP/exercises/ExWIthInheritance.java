package AgainRepeat.OOP.exercises;

public class ExWIthInheritance {
    public static void main(String[] args) {
        Cars cars = new Cars("Mers", 2010, 302);
        cars.show();
        Cars vc = new Cars("Mazda", 2020, 300);
        vc.show();
    }
}

class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

class Cars extends Vehicle {
    int maxSpeed;

    public Cars(String brand, int year, int maxSpeed) {
        super(brand, year);
        this.maxSpeed = maxSpeed;
    }
    void show() {
        System.out.println("Brand: " + brand+" Year: " + year+ " Max Speed: " + this.maxSpeed);
    }
}
