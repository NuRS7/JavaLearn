package interfaces.mechanizm;

public class EventsApp {
    public static void main(String[] args) {
        Button tvButton = new Button(new EvenHandler() {

            private boolean on  = false;

            @Override
            public void execute() {
                if (on) {
                    System.out.println("TV is off");
                    on = false;
                } else {
                    System.out.println("TV is on");
                    on = true;
                }
            }
        });


        Button printButton = new Button(new EvenHandler() {

            @Override
            public void execute() {
                System.out.println("Print start...");
            }
        });

        tvButton.click();
        printButton.click();
        tvButton.click();
    }
}
