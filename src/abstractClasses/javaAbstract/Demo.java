package abstractClasses.javaAbstract;

public class Demo {
    public static void main(String[] args) {
        Phone phone = new Phone("Xiaomi", true, "phone","KZ");
        Laptop laptop = new Laptop("Lenovo", false, "laptop", 33);
        phone.turnOn();
        phone.turnOff();
        System.out.println(phone.getCountry());
        System.out.println(phone.getDeviceName() + " " + phone.getDeviceType()+" " + phone.isOn());
        System.out.println();
        laptop.turnOn();
        laptop.turnOff();
        System.out.println(laptop.getDeviceName() + " " + laptop.getDeviceType() + " " + laptop.isOn());
        ((Laptop) laptop).chargBattery(33);
        Phone phone1 = new Phone("Huawei", true, "phone", "RU", "+777177","NUR");
        phone1.callMake();
        phone1.makeCall();
        phone1.makeCall("Hello I called u");
    }
}
