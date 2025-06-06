package AgainRepeat.OOP.exercises;

public class ExWithPolymorphism5 {
    public static void main(String[] args) {
        Delivery[] delivery = {

                new CourierDelivery(),
                new DroneDelivery(),
                new PostDelivery()
        };

        for (Delivery d : delivery) {
            System.out.println(d.deliver("Laptop"));
        }
    }
}

interface Delivery {
    String deliver(String item);
}


class CourierDelivery implements Delivery {

    @Override
    public String deliver(String item) {
        return "Курьер доставил: "+ item;
    }
}

class DroneDelivery implements Delivery {

    @Override
    public String deliver(String item) {
        return "Дрон доставил: "+item;
    }
}

class PostDelivery implements Delivery {

    @Override
    public String deliver(String item) {
        return "Почта доставила: "+item;
    }
}