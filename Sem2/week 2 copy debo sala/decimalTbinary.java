import java.util.Scanner;

public class decimalTbinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary equivalent: " + binaryNumber);
    }

    public static String decimalToBinary(int decimalNumber) {
        StringBuilder binaryNumber = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber.insert(0, remainder);
            decimalNumber /= 2;
        }

        return binaryNumber.toString();
    }
}
