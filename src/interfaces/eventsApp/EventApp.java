package interfaces.eventsApp;

public class EventApp {
    public static void main(String[] args) {
        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();
        button.click();

    }
}

class ButtonClickHandler implements EventHandler {
    public void execute() {
        System.out.println("Button Clicked");
    }
}

class Button {
    EventHandler eventHandler;

    public Button(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void click() {
        eventHandler.execute();
    }
}