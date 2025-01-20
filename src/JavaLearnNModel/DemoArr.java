package JavaLearnNModel;

import java.util.Arrays;

public class DemoArr {
    public static void main(String[] args) {
        String[] cars = new String[5];
        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Mazda";
        cars[4] = "Mercedes";
        String car = Arrays.toString(cars);
        System.out.println(car);
    }
}
