import java.util.*;

class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point center;
    double radius;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void displayArea() {
        System.out.println("Area of the circle: " + calculateArea());
    }
}

public class q1_area_of_circle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the x-coordinate of the center: ");
        double x = sc.nextDouble();
        System.out.print("Enter the y-coordinate of the center: ");
        double y = sc.nextDouble();
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Point center = new Point(x, y);

        Circle circle = new Circle(center, radius);

        circle.displayArea();
    }
}
