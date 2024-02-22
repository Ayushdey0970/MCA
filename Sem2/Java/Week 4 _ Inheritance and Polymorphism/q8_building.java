import java.util.*;

class Building {
    protected int numFloors;
    protected int numRooms;
    protected double totalFootage;

    public Building(int numFloors, int numRooms, double totalFootage) {
        this.numFloors = numFloors;
        this.numRooms = numRooms;
        this.totalFootage = totalFootage;
    }

    public String toString() {
        return "Number of Floors: " + numFloors + ", Number of Rooms: " + numRooms + ", Total Footage: " + totalFootage;
    }
}

class House extends Building {
    private int numBedrooms;
    private int numBathrooms;

    public House(int numFloors, int numRooms, double totalFootage, int numBedrooms, int numBathrooms) {
        super(numFloors, numRooms, totalFootage);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
    }

    public String toString() {
        return super.toString() + ", Number of Bedrooms: " + numBedrooms + ", Number of Bathrooms: " + numBathrooms;
    }
}

public class q8_building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Building:");
        System.out.print("Number of Floors: ");
        int buildingFloors = scanner.nextInt();
        System.out.print("Number of Rooms: ");
        int buildingRooms = scanner.nextInt();
        System.out.print("Total Footage: ");
        double buildingFootage = scanner.nextDouble();
        Building building = new Building(buildingFloors, buildingRooms, buildingFootage);
        System.out.println("Enter details for House:");
        System.out.print("Number of Floors: ");
        int houseFloors = scanner.nextInt();
        System.out.print("Number of Rooms: ");
        int houseRooms = scanner.nextInt();
        System.out.print("Total Footage: ");
        double houseFootage = scanner.nextDouble();
        System.out.print("Number of Bedrooms: ");
        int houseBedrooms = scanner.nextInt();
        System.out.print("Number of Bathrooms: ");
        int houseBathrooms = scanner.nextInt();
        House house = new House(houseFloors, houseRooms, houseFootage, houseBedrooms, houseBathrooms);
        System.out.println("\nBuilding Details:");
        System.out.println(building);
        System.out.println("\nHouse Details:");
        System.out.println(house);

        scanner.close();
    }
}
