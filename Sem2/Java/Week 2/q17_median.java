import java.util.*;
class q17_median {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) {
            ar[i]=sc.nextInt();
        }
        int index=0;
        if(n%2==0) {
            index=((n/2)+(n/2+1))/2-1;
        }
        else {
            index=(n+1)/2-1;
        }
        System.out.println(ar[index]);
    }
}
