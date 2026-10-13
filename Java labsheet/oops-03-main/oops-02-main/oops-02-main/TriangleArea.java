import java.util.Scanner;

class TriangleArea {
    double a, b, c;

    TriangleArea(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void calculateArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of Triangle = " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        TriangleArea obj = new TriangleArea(a, b, c);
        obj.calculateArea();
    }
}