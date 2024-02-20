import java.util.*;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = (denominator != 0) ? denominator : 1;
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public void displayFraction() {
        System.out.println("Fractional Value: " + numerator + "/" + denominator);
    }
}

public class q7_fractional_value {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter First Numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter First Denominator: ");
        int b = sc.nextInt();
        Fraction fraction1 = new Fraction(a, b);
        System.out.print("Enter First Numerator: ");
        int x = sc.nextInt();
        Fraction fraction2 = new Fraction(x);
        Fraction fraction3 = new Fraction();

        fraction1.displayFraction();
        fraction2.displayFraction();
        fraction3.displayFraction();
    }
}
