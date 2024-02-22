import java.util.*;

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class q2_method_overload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for addition:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Result of addition using 2 nos" + Adder.add(num1, num2));
        System.out.println("Enter three numbers for addition:");
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        System.out.println("Result of addition using 3 nos: " + Adder.add(num3, num4, num5));
        scanner.close();
    }
}
