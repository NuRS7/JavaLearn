package U;

class RP {

    public static void behaviourIfMeetHuman() {
        System.out.println("Грозно рычать");
    }

}


class RR extends RP {
    public static void behaviourIfMeetHuman() {
        System.out.println("Радостно вилять хвостом");
    }

}

public class U20 {
    public static void main(String[] args) {
        RP rp = new RR();
        rp.behaviourIfMeetHuman();

    }
}

