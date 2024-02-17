import java.util.Scanner;

public class q8_sum_diagonal_elements_2darray 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int s=0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ar[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
                if(i==j)
                {
                    s=s+ar[i][j];
                }
            }
        }
      System.out.println("the sum is "+s);
    }
}
