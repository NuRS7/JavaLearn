package interfaces.base;

public class Client extends Base implements Call {
    public void call() {
        System.out.println("call() of class Client extends from Base" + NUM);
        super.call();

    }

}
