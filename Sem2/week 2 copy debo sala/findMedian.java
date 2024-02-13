import java.util.Scanner;
import java.util.Arrays;

public class findMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int median;
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if (n % 2 != 0) {
            median = arr[((n + 1) / 2) - 1];
            System.out.printf("Median : %d\n", median);
        } else {
            median = arr[(((n / 2) + ((n + 1) / 2)) / 2) - 1];
            System.out.printf("Median : %d\n", median);
        }
    }
}
