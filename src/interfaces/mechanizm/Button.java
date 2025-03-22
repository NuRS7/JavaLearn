package interfaces.mechanizm;

public class Button{


    EvenHandler evenHandler;
    Button(EvenHandler action) {
        this.evenHandler = action;
    }
    public void click() {
        evenHandler.execute();
    }


    }
