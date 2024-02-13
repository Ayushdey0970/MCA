import java.util.*;

class q5_rectangle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area: " + (l * b));
        System.out.println("Perimeter: " + 2 * (l + b));
    }
}
