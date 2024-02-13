import java.util.Scanner;

public class fibonacciSeries {

    static int n1 = 0, n2 = 1, n3 = 0;

    static void fibonacci(int t) {
        if (t == 0)
            return;

        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.print(" " + n3);
        fibonacci(t - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        int term = sc.nextInt();

        System.out.print(n1 + " " + n2);
        fibonacci(term - 2);

        sc.close();
    }
}
