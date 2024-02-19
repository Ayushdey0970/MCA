import java.util.*;

class q17_merge_float_arrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int m = sc.nextInt();
        float ar[][] = new float[n][m];
        System.out.println("Enter First Matrix Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextFloat();
            }
        }
        float arr[][] = new float[n][m];
        System.out.println("Enter Second Matrix Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextFloat();
                ar[i][j] += arr[i][j];
            }
        }
        System.out.println("Merged Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
