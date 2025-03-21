package interfaces;

public class Animal implements Info {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        if (id == 1) {
            System.out.println("Animal number- "+id+ " is sleeping");
        } else System.out.println("Animal number- "+id+ " are sleeping");
    }


    @Override
    public void showInfo() {
        System.out.println("ID is" + this.id);
    }
}
