package interfaces.base;

public class Base implements Call{
    int i = -5;

    @Override
    public void call() {
        System.out.println("call() of class Base " + i);
    }
}
