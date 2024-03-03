import java.util.*;

class ThreeDObject {
    public void wholeSurfaceArea() {
    }

    public void volume() {
    }
}

class box extends ThreeDObject {

    private double length, breadth, height;

    box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public void wholeSurfaceArea() {
        System.out.println(2 * length * breadth + 2 * length * height + 2 * breadth * height);
    }

    @Override
    public void volume() {
        System.out.println(length * breadth * height);
    }
}

class cube extends ThreeDObject {

    private double length;

    cube(double length) {
        this.length = length;
    }

    @Override
    public void wholeSurfaceArea() {
        System.out.println(6 * length);
    }

    @Override
    public void volume() {
        System.out.println(Math.pow(length, 3));
    }
}

class cylinder extends ThreeDObject {

    private double radius, height;

    cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void wholeSurfaceArea() {
        System.out.println(2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void volume() {
        System.out.println(Math.PI * Math.pow(radius, 2) * height);
    }
}

class cone extends ThreeDObject {

    private double radius, height;

    cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void wholeSurfaceArea() {
        System.out.println(Math.PI * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
    }

    @Override
    public void volume() {
        System.out.println(Math.PI * Math.pow(radius, 2) * height / 3);
    }
}

class q3_volume_surface_area extends ThreeDObject {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("1. Box\n2. Cube\n3. Cylinder\n4. Cone");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter Length: ");
                double length = sc.nextDouble();
                System.out.print("Enter Breadth: ");
                double breadth = sc.nextDouble();
                System.out.print("Enter Height: ");
                double height = sc.nextDouble();
                box obj = new box(length, breadth, height);
                obj.wholeSurfaceArea();
                obj.volume();
                break;
            case 2:
                System.out.print("Enter Length: ");
                length = sc.nextDouble();
                cube obj1 = new cube(length);
                obj1.wholeSurfaceArea();
                obj1.volume();
                break;
            case 3:
                System.out.print("Enter Radius: ");
                double radius = sc.nextDouble();
                System.out.print("Enter Height: ");
                height = sc.nextDouble();
                cylinder o1 = new cylinder(radius, height);
                o1.wholeSurfaceArea();
                o1.volume();
                break;
            case 4:
                System.out.print("Enter Radius: ");
                radius = sc.nextDouble();
                System.out.print("Enter Height: ");
                height = sc.nextDouble();
                cone o2 = new cone(radius, height);
                o2.wholeSurfaceArea();
                o2.volume();
                break;
        }
    }
}
