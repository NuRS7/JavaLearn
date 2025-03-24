package inheritance;

public class Car {
    private String nameCar;

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    protected void showName() {
        System.out.println("name:" + nameCar);
    }
}


