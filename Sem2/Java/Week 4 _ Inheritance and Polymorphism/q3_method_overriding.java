import java.util.*;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

public class q3_method_overriding extends Vehicle {
    public static void main(String args[]) {
        q3_method_overriding obj = new q3_method_overriding();
        obj.run();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to override 'run' method: ");
        String message = scanner.nextLine();
        obj.run(message);
        scanner.close();
    }

    void run(String message) {
        System.out.println("Overridden run method: " + message);
    }
}
