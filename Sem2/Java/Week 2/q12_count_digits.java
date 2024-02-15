import java.util.*;

class q12_count_digits {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
