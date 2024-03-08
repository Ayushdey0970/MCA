import java.util.*;

abstract class motorVehicle {
    String modelName;
    long modelNumber;
    float modelPrice;

    motorVehicle(String modelName, long modelNumber, float modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    void display() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: " + modelPrice);
    }
}

class Carthat extends motorVehicle {
    float discountRate;

    Carthat(String modelName, long modelNumber, float modelPrice, float discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate;
    }

    float discount() {
        return modelPrice * (1 - discountRate / 100);
    }

    void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Discounted Price: " + discount());
    }

}

class q9_vehicles {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Model Name: ");
        String modelName = sc.next();
        System.out.print("Enter Model Number: ");
        long modelNumber = sc.nextLong();
        System.out.print("Enter Price: ");
        float modelPrice = sc.nextFloat();
        System.out.print("Enter Discount Rate: ");
        float discount = sc.nextFloat();
        Carthat o = new Carthat(modelName, modelNumber, modelPrice, discount);
        o.display();
    }
}
