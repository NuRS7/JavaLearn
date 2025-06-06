package AgainRepeat.OOP.exercises;

public class ExWithPolymorphism1 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape square = new Square();
        square.draw();
        Shape triangle = new Triangle();
        triangle.draw();
        Shape[] shapes = {shape, circle, square, triangle};
        for (Shape s : shapes) {
            s.draw();
        }
    }
}

class Shape {
    void draw() {
        System.out.println("Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle");
    }
}