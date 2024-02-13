import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to generate table : ");
        int num = sc.nextInt();

        System.out.println("The multiplication table : ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }

        sc.close();
    }
}
