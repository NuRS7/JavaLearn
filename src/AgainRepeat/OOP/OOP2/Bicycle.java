package AgainRepeat.OOP.OOP2;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;


    Bicycle(int StarCadence, int StarGear, int StarSpeed) {
        this.cadence = StarCadence;
        this.gear = StarGear;
        this.speed = StarSpeed;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBrake(int descriment) {
        speed -= descriment;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
