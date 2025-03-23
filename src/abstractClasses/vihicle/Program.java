package abstractClasses.vihicle;

public class Program {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane airplane = new Airplane();
        Boat boat = new Boat();
        car.move();
        airplane.move();
        boat.move();

    }
}
