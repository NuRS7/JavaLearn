package E_Model;

public class E43 {
    public static void main(String[] args) {


        int value = 42;
        do {

            value++;
            if (value > 44 && value < 48) {
                break;
            }
            System.out.println(value);
        }
        while (value < 40 );
        System.out.println("end");

    }


}