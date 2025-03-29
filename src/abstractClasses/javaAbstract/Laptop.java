package abstractClasses.javaAbstract;

public class Laptop extends Device {
    private int batteryLevel;
    public Laptop(String deviceName, boolean isOn, String deviceType, int batteryLevel) {
        super(deviceName, isOn, deviceType);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void turnOn() {
        System.out.println(getDeviceName()+ " is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println(getDeviceName() + " is turned off");
    }

    public void chargBattery(int prosent) {
        batteryLevel = Math.min(100, batteryLevel + prosent);
        System.out.println("Battery level: " + batteryLevel);
    }
}
