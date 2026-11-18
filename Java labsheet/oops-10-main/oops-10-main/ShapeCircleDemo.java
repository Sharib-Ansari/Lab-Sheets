import java.util.ArrayList;

class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area = " +
            (3.14 * radius * radius));
    }
}

public class ShapeCircleDemo {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();

        list.add(new Circle(5));
        list.add(new Circle(3));
        list.add(new Circle(7));

        for (Shape s : list) {
            s.area();
        }
    }
}