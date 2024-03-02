import java.util.*;

abstract class shape {
    abstract double area();

    abstract void info();
}

class rect extends shape {
    private double length;
    private double breadth;

    rect(double length, double breadth) {
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
}

class triangle extends shape {
    private double height, base;

    triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    void info() {
        System.out.println("The Height of the triangle is " + height + " and base is " + base);
    }

    double area() {
        return height * base / 2;
    }
}

class q1_area_info {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("1. Rectangle\n2. Triangle: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter Length: ");
                double length = sc.nextDouble();
                System.out.print("Enter Breadth: ");
                double breadth = sc.nextDouble();
                rect o1 = new rect(length, breadth);
                o1.info();
                System.out.println("Area: " + o1.area());
                break;
            case 2:
                System.out.print("Enter Height: ");
                double height = sc.nextDouble();
                System.out.print("Enter Base: ");
                double base = sc.nextDouble();
                triangle o2 = new triangle(height, base);
                o2.info();
                System.out.println("Area: " + o2.area());
                break;
        }
    }
}
