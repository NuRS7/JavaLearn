package inheritance;

public class Derived extends Base {
    private int c;

    public Derived(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public void showDisplay() {
        System.out.println("Derived a = " + a);
        System.out.println("Derived b = " + b);
        System.out.println("Derived c = " + c);

    }
}
