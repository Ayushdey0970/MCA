import java.util.*;

class q1_rect extends shape {
    private double length;
    private double breadth;

    q1_rect(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    void info() {
        System.out.println("The Rectangle has length " + length + " and breadth " + breadth);
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        q1_rect obj = new q1_rect(length, breadth);
        obj.info();
        System.out.println("Area: " + obj.area());
    }
}
