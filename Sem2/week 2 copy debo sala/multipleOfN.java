import java.util.Scanner;

public class multipleOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend : ");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor : ");
        int divisor = sc.nextInt();

        if (dividend % divisor == 0) {
            System.out.printf("%d is multiple of %d", dividend, divisor);
        } else {
            System.out.printf("%d is not a multiple of %d", dividend, divisor);
        }
    }
}
