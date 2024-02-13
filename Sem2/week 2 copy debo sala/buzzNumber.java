import java.util.Scanner;

public class buzzNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int temp = num;

        int last = temp % 10;

        if (num % 7 == 0 || last == 7)
            System.out.println("Buzz Number");
        else
            System.out.println("Not Buzz");

        sc.close();
    }
}
