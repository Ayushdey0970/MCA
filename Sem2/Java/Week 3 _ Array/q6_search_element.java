import java.util.*;

class q6_search_element {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] == s) {
                flag++;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
        }
    }
}
