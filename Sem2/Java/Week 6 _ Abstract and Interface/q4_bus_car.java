import java.util.*;

class vehicle {
    protected long regNumber;
    protected float speed;
    protected String color, ownerName;

    vehicle(long regNumber, float speed, String color, String ownerName) {
        this.regNumber = regNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    void showData() {
        System.out.println("This is a Vehicle Class");
        System.out.println("Registration Number: " + regNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

class bus extends vehicle {
    private long routeNumber;

    bus(long regNumber, float speed, String color, String ownerName, long routeNumber) {
        super(regNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    void showData() {
        super.showData();
        System.out.println("This is Bus Class: ");
        System.out.println("Route Number: " + routeNumber);
    }
}

class car extends vehicle {
    private String manuName;

    car(long regNumber, float speed, String color, String ownerName, String manuName) {
        super(regNumber, speed, color, ownerName);
        this.manuName = manuName;
    }

    void showData() {
        super.showData();
        System.out.println("This is Car Class: ");
        System.out.println("Manufacturer Name: " + manuName);
    }

}

class q4_bus_car {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("1. Bus\n2. Car");
        int ch = sc.nextInt();
        System.out.print("Enter Registration Number: ");
        long regNumber = sc.nextLong();
        System.out.print("Enter Speed: ");
        float speed = sc.nextFloat();
        System.out.print("Enter Color: ");
        String color = sc.next();
        System.out.print("Enter Owner Name: ");
        String ownerName = sc.next();
        switch (ch) {
            case 1:
                System.out.print("Enter Route Number: ");
                long routeNumber = sc.nextLong();
                bus o1 = new bus(regNumber, speed, color, ownerName, routeNumber);
                o1.showData();
                break;
            case 2:
                System.out.println("Enter Manufacturer's Name: ");
                String manuName = sc.next();
                car o2 = new car(regNumber, speed, color, ownerName, manuName);
                o2.showData();
                break;
        }
    }
}
