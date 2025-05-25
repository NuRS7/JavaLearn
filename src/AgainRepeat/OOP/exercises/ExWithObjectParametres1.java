package AgainRepeat.OOP.exercises;

public class ExWithObjectParametres1 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(30, 50);
        Calculator1 calculator1 = new Calculator1();
        int result = calculator1.calculateArea(rectangle);
        System.out.println(result);

    }
}

class Rectangle {
    int width;
    int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class Calculator1 {
    int calculateArea(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }
}