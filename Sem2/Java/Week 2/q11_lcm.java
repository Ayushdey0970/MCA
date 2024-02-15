import java.util.*;

class q11_lcm {
    static Scanner sc = new Scanner(System.in);

    static int hcf(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return hcf(a, a % b);
        }
    }

    public static void main(String args[]) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int hcf = hcf(a, b);
        System.out.println(a * b / hcf);
    }
}
