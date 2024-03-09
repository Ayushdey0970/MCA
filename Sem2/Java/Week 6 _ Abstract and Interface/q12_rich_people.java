import java.util.*;

class vehicle {
    long id;
    String name, licenseNumber;

    vehicle(long id, String name, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("License Number: " + licenseNumber);
    }
}

class twoWheeler extends vehicle {
    twoWheeler(long id, String name, String licenseNumber) {
        super(id, name, licenseNumber);
    }

    void steeringHandle() {
        System.out.println("Turning Steering Handle!!");
    }
}

class fourWheeler extends vehicle {
    fourWheeler(long id, String name, String licenseNumber) {
        super(id, name, licenseNumber);
    }

    void steeringWheel() {
        System.out.println("Turning Steering Wheel!!");
    }
}

class q12_rich_people {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Id: ");
        long id = sc.nextLong();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter License Number: ");
        String licenseNumber = sc.next();
        System.out.println("\nDo you want a Two-Wheeler or a Four-Wheeler?\n1. Two-Wheeler\n2. Four-Wheeler: ");
        int n = sc.nextInt();
        if (n == 1) {
            twoWheeler o1 = new twoWheeler(id, name, licenseNumber);
            o1.steeringHandle();
        } else {
            fourWheeler o2 = new fourWheeler(id, name, licenseNumber);
            o2.steeringWheel();
        }
    }
}
