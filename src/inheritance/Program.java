package inheritance;

public class Program {
    public static void main(String[] args) {
        Car car = new Car();
        car.setNameCar("Car1");
        car.showName();

        ElectricalCar electricalCar = new ElectricalCar();
        electricalCar.setNameCar("Car2");
        electricalCar.showName();
    }
}
