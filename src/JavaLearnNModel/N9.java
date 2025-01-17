package JavaLearnNModel;

import javax.management.ConstructorParameters;

class DataDay{
    int day;
    String name;

}


class StaticTest {
    static int i = 47;

}
class Incrementable {
    static int increment() {
        StaticTest.i++;
        return StaticTest.i;
    }
}

public class N9 {
    int storage(String s) {
        return s.length() * 2;

    }



    public static void main(String[] args) {

        int c = Incrementable.increment();
        System.out.println(c);

        DataDay dataDay = new DataDay();
        dataDay.day = 1;
        dataDay.name = "Monday";
        System.out.println(dataDay.day + " " + dataDay.name);


        N9 n9 = new N9();
        int a = n9.storage("Hello");
        System.out.println(a);

    }


}

