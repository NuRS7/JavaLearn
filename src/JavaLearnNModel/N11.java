package JavaLearnNModel;


 class Car {
    String color = "white";
     String engine = "V8";

}
public class N11 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();
        System.out.println(car.color + " " + car.engine);
        System.out.println(car1.color+ " "+ car1.engine);
        Car car2 = new Car();
        car2.color = "black";
        car2.engine = "V6";
        System.out.println(car2.color + " " + car2.engine);
    }
}
