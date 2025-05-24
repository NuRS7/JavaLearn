package AgainRepeat.OOP.OOP2;

public class MountainBike extends Bicycle {
    int height;

    public MountainBike(int StarCadence, int StarGear, int StarSpeed, int StarHeight) {
        super(StarCadence, StarGear, StarSpeed);
        this.height = StarHeight;
    }
    public void setHeight(int newValue) {
        height += newValue;
    }
    public String toString() {
        return "MountainBike height=" + height + " StarCadence= " + super.cadence + " StarGear= " + super.gear+" StarSpeed= "+ super.speed ;
    }
}
