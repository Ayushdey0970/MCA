import java.util.*;

class q1_triangle extends shape {
    private double height, base;

    q1_triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    void info() {
        System.out.println("The Height of the triangle is " + height + "and base is " + base);
    }

    double area() {
        return height * base / 2;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        double height = sc.nextDouble();
        double base = sc.nextDouble();
        q1_triangle obj = new q1_triangle(height, base);
        obj.info();
        System.out.println("Area: " + obj.area());
    }

}
