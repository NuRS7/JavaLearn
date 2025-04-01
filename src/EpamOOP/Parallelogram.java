package EpamOOP;

import java.util.Scanner;

class Parallelogram {
    protected double a, b, angle;

    // Единственный публичный конструктор
    public Parallelogram(double a, double b, double angle) {
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    public double perimeter() {
        return 2 * (a + b);
    }

    public double area() {
        return a * b * Math.sin(Math.toRadians(angle));
    }
}

class Rectangle extends Parallelogram {
    public Rectangle(double a, double b) {
        super(a, b, 90); // У прямоугольника угол всегда 90°
    }
}

class Rhombus extends Parallelogram {
    public Rhombus(double a, double angle) {
        super(a, a, angle); // У ромба все стороны равны
    }
}

class Square extends Rectangle {
    public Square(double a) {
        super(a, a); // Квадрат — это прямоугольник с равными сторонами
    }
}

class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double alpha = sc.nextDouble();

            // Создаем массив с 4 фигурами
            Parallelogram[] shapes = {
                    new Parallelogram(a, b, alpha),
                    new Rectangle(a, b),
                    new Rhombus(a, alpha),
                    new Square(a)
            };

            double totalPerimeter = 0;
            double totalArea = 0;

            for (Parallelogram shape : shapes) {
                totalPerimeter += shape.perimeter();
                totalArea += shape.area();
            }

            // Вывод с округлением до 3 знаков
            System.out.printf("%.3f %.3f%n", totalPerimeter, totalArea);
        }
    }
}
