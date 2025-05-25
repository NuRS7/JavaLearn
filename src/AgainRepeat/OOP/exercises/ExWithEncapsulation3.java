package AgainRepeat.OOP.exercises;

public class ExWithEncapsulation3 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setBrand("Mercedes Maybach S680");
        car.setSpeed(299);
        car.displayInfo();
    }
}

class Car {
    private String brand;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (0 > speed || speed > 300) {
            throw new IllegalArgumentException("Speed must be between 0 and 300");
        }
        else this.speed = speed;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty");
        }
        else this.brand = brand;
    }
    void displayInfo() {
        System.out.println("Brand: " + getBrand()+ " speed is " + getSpeed());
    }
}