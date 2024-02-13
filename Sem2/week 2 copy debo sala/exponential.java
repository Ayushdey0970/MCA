import java.util.Scanner;

public class exponential {

    static int res = 1;

    static int expo(int n, int p) {
        for (int i = 1; i <= p; i++) {
            res *= n;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("Enter the power");
        int exp = sc.nextInt();

        int result = expo(num, exp);

        System.out.println(result);

        sc.close();
    }
}
