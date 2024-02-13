import java.util.Scanner;

public class hcfAndLcm {

    static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int calculateLCM(int a, int b) {
        return (a * b) / calculateHCF(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int hcf = calculateHCF(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("HCF : " + hcf);
        System.out.println("LCM : " + lcm);

        sc.close();
    }
}
