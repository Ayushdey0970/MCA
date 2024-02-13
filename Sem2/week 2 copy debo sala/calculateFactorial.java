public class calculateFactorial {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int fact = factorial(12);

        System.out.printf("Factorial of 12 is %d\n", fact);
    }
}
