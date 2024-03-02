import java.util.*;

class ThreeDObject {
    public void wholeSurfaceArea() {
        return;
    }

    public void volume() {
        return;
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
        return;
    }

    @Override
    public void volume() {
        System.out.println(length * breadth * height);
        return;
    }
}

class q3_volume_surface_area extends ThreeDObject {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

    }
}
