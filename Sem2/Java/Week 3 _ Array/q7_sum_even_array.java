import java.util.Scanner;

public class q7_sum_even_array 
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int s=0;
        int n = sc.nextInt();
        int ar[]=new int[n];
        for (int i = 0; i < n; i++)
         {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
         {
            if(ar[i]%2==0)
            s=s+ar[i];
        }
        System.out.println("the sum is "+s);
    }
}
