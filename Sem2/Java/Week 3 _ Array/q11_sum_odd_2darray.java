import java.util.*;
class q11_sum_odd_2darray 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) 
    {
        int s=0;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ar[][] = new int[n][m];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                ar[i][j] = sc.nextInt();
                if(ar[i][j]%2!=0)
                {
                    s=s+ar[i][j];
                }
            }
        }
        System.out.println("the sum is "+s);

    }
}
 