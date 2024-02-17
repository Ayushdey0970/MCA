import java.util.Scanner;

public class q9_reverse_array 
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
    int n = sc.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i < n; i++)
         {
            ar[i] = sc.nextInt();
        }
        System.out.println("reverse order is");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(ar[i]+" ") ;
        }
}
}
