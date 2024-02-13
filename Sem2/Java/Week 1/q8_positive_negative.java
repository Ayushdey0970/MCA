import java.util.*;

class q8_positive_negative {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println(x + " is a Positive Number");
        } else {
            System.out.println(x + " is a Negative Number");
        }
    }
}
