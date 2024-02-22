import java.util.*;

class Complex {
    public static void f1() {
        System.out.println("f1 method of the Complex class is executed.");
    }
}

class Sample extends Complex {
    public static void f1() {
        System.out.println("f1 of the Sample class is executed.");
    }
}

public class q4_method_hiding {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to execute f1 from Complex class, 2 to execute f1 from Sample class:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Complex.f1();
        } else if (choice == 2) {
            Sample.f1();
        } else {
            System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
