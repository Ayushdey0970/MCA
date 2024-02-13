import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryNumber = scanner.nextLine();

        int decimalNumber = binary(binaryNumber);
        System.out.println("Decimal equivalent: " + decimalNumber);
    }

    public static int binary(String binaryNumber) {
        int decimalNumber = 0;
        int length = binaryNumber.length();

        for (int i = 0; i < length; i++) {
            int digit = binaryNumber.charAt(i) - '0';
            int power = length - 1 - i;
            decimalNumber += digit * Math.pow(2, power);
        }

        return decimalNumber;
    }
}
