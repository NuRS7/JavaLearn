package interfaces.EventRun;

public class Event {
    Go action;

    public Event(Go action) {
        this.action = action;
    }
    public void goAction() {
        action.go();
    }
    public void getUpAction() {
        action.get_up();
    }
}
