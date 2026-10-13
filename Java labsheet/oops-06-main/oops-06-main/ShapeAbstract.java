abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2;

        return Math.sqrt(
            s * (s - a) * (s - b) * (s - c)
        );
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class ShapeAbstract {
    public static void main(String[] args) {

        Circle circle = new Circle(5);

        System.out.println("Circle Area = " + circle.calculateArea());
        System.out.println(
            "Circle Perimeter = " + circle.calculatePerimeter()
        );

        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Triangle Area = " + triangle.calculateArea());
        System.out.println(
            "Triangle Perimeter = " + triangle.calculatePerimeter()
        );
    }
}