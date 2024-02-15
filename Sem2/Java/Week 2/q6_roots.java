import java.util.*;

class q6_roots {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Enter \'a\': ");
        int a = sc.nextInt();
        System.out.print("Enter \'b\': ");
        int b = sc.nextInt();
        System.out.print("Enter \'c\': ");
        int c = sc.nextInt();
        double x = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double r1 = (-b + x) / (2 * a);
        double r2 = (-b - x) / (2 * a);
        System.out.printf("%.2f %.2f", r1, r2);
    }
}
