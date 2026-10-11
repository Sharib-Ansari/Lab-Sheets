// Question 14: Shape Hierarchy
// Concept: Hierarchical Inheritance, Polymorphic/Specialized Calculation Methods in Derived Classes

// Parent Class: Shape
class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public void displayShapeName() {
        System.out.println("Shape Type: " + shapeName);
    }
}

// Child Class 1: Rectangle (Inherits Shape)
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Rectangle calculates its OWN area (Logic NOT in main)
    public double calculateArea() {
        return length * width;
    }

    public void displayRectangleDetails() {
        displayShapeName();
        System.out.println("Length : " + length);
        System.out.println("Width  : " + width);
        System.out.println("Area   : " + calculateArea());
        System.out.println("-------------------------");
    }
}

// Child Class 2: Circle (Inherits Shape)
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Circle calculates its OWN area (Logic NOT in main)
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void displayCircleDetails() {
        displayShapeName();
        System.out.println("Radius : " + radius);
        System.out.println("Area   : " + String.format("%.2f", calculateArea()));
        System.out.println("-------------------------");
    }
}

public class Q14_ShapeHierarchy {
    public static void main(String[] args) {
        // Main creates child objects and calls their display/area methods
        Rectangle rect = new Rectangle(10.5, 4.0);
        Circle circle = new Circle(7.0);

        System.out.println("=== HIERARCHICAL SHAPE AREA CALCULATIONS ===");
        rect.displayRectangleDetails();
        circle.displayCircleDetails();
    }
}
