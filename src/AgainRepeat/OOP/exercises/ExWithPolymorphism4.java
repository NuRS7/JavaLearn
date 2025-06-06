package AgainRepeat.OOP.exercises;

import java.util.Scanner;

public class ExWithPolymorphism4 {
    public static void main(String[] args) {
        ShapeInterface[] shapeInterfaces = {
                new CircleClass(5),
                new RectangleClass(3,20.0),
                new TriangleClass(25,2),
        };
        for (ShapeInterface shapeInterface : shapeInterfaces) {
            System.out.println(shapeInterface.getArea());
        }
    }
}

interface ShapeInterface {
    double getArea();
}

class CircleClass implements ShapeInterface {

    private double radius;

    CircleClass(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.floor(Math.PI * radius * radius);
    }
}

class RectangleClass implements ShapeInterface {
    private double width;
    private double height;

    RectangleClass(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class TriangleClass implements ShapeInterface {
    double height;
    double base;

    TriangleClass(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return height * base * 0.5;
    }
}


