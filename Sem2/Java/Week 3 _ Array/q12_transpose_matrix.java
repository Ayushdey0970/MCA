import java.util.*;
class q12_transpose_matrix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) 
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ar[][] = new int[n][m];
        int temp;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                ar[i][j] = sc.nextInt();
            }
        }   
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
               temp=ar[i][j];
               ar[i][j]=ar[j][i];
               ar[j][i]=temp;
            }
        }
        System.out.println("the transpose of matrix is");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
               System.out.print(ar[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
