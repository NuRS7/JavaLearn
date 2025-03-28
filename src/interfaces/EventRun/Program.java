package interfaces.EventRun;

public class Program {
    public static void main(String[] args) {
        Event event = new Event(new Execute());
        event.goAction();
        event.getUpAction();
    }
}
