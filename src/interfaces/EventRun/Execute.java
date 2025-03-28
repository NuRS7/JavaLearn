package interfaces.EventRun;

public class Execute implements Go {
    @Override
    public void go() {
        System.out.println("Going to sleep");
    }

    @Override
    public void get_up() {
        System.out.println("Get up");
    }
}
