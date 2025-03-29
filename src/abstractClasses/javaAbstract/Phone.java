package abstractClasses.javaAbstract;

import java.util.Locale;

public class Phone extends Device implements CallMaker {
    private String country;
    private String callNumber;
    private String personName;
    public Phone(String deviceName, boolean isOn, String deviceType, String model) {
        super(deviceName, isOn, deviceType);
        this.country = model;
    }
    public Phone(String deviceName, boolean isOn, String deviceType, String country, String callNumber) {
        super(deviceName, isOn, deviceType);
        this.country = country;
        this.callNumber = callNumber;
    }
    public Phone(String deviceName, boolean isOn, String deviceType, String country, String callNumber, String personName) {
        super(deviceName, isOn, deviceType);
        this.country = country;
        this.callNumber = callNumber;
        this.personName = personName;
    }

    @Override
    public void turnOn() {
        System.out.println(getDeviceName() + "" + " is turned on");

    }

    @Override
    public void turnOff() {
        System.out.println(getDeviceName() + "" + " is turned off");
    }

    public String getCountry() {
        return country;
    }
    public void callMake() {
        System.out.println(getDeviceName()+" "+callNumber + " called");
    }

    public String getPersonName(){
        return personName;
    }
    public String getCallNumber(){
        return callNumber;
    }

    @Override
    public void makeCall() {
        System.out.println(getPersonName() + "on" + " " + getDeviceType() + " " + getCallNumber() + " country: " + getCountry());
    }
    
    public void makeCall(String message) {
        System.out.println(getPersonName() + "on" + " " + getDeviceType() + " " + getCallNumber() + " country: " + getCountry()+" message===>"+message);
    }
}
