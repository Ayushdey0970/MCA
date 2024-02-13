import java.util.Scanner;

public class reverseNumber {

    static int reverse(int n) {
        int rev = 0, rem;

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int temp = reverse(num);
        System.out.printf("The reverse of %d is %d\n", num, temp);

        sc.close();
    }
}
