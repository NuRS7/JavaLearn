package abstractClasses.javaAbstract;

public abstract class Device {
    private String deviceName;
    private String deviceType;
    private boolean isOn;

    public Device(String deviceName, boolean isOn, String deviceType) {
        this.deviceName = deviceName;
        this.isOn = isOn;
        this.deviceType = deviceType;
    }

    public Device(String callNumber) {
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {

        if (deviceName == null || deviceName.isEmpty()) {
            this.deviceName = deviceName;
        } else {
            throw new ErrorSetrter("Не может быть пустым");
        }
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        if (deviceType == null || deviceType.isEmpty()) {
            this.deviceType = deviceType;
        } else {
            throw new ErrorSetrter("Укажите тип оно не может быть пустым");
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        if (on) {
            isOn = on;
        }
    }

    public abstract void turnOn();
    public abstract void turnOff();

}
