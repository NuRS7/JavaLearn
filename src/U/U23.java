package U;

class Parent{
     void showMessage(){
        System.out.println("Message from Parents");
    }
}

class Child extends Parent {
    @Override
    void showMessage() {
        super.showMessage();
        System.out.println("Message from Child");
    }
}

public class U23 {
    public static void main(String[] args) {
        Child c = new Child();

        c.showMessage();
    }
}
