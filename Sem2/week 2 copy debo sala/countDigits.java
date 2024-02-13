import java.util.Scanner;

public class countDigits {

    static int calculateDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int count = calculateDigits(num);
        System.out.printf("There are %d digit(s) int %d\n", count, num);

        sc.close();
    }
}
