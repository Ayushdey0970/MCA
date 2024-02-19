class Box {
    double width;
    double height;
    double depth;

    Box() {
        width = 1;
        height = 1;
        depth = 1;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(double len) {
        width = len;
        height = len;
        depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class q26_constructor_overloading {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5, 3, 4);
        Box box3 = new Box(2.5);

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }
}
