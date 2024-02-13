import java.util.Scanner;

public class naturalNumbers {

    static int calculateSum(int n) {
        if (n == 0)
            return 0;
        return n + calculateSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int range = sc.nextInt();

        int sum = calculateSum(range);
        System.out.printf("The sum till %d is %d\n", range, sum);

        sc.close();
    }
}
