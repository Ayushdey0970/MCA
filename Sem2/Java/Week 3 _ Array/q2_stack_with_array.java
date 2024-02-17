import java.util.*;

class q2_stack_with_array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        int top = -1;
        while (true) {
            System.out.println("1. Push\n2. Pop");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if (top == ar.length - 1) {
                        System.out.println("Stack Overflow");
                    } else {
                        System.out.print("Enter Value: ");
                        int val = sc.nextInt();
                        top++;
                        ar[top] = val;
                    }
                    break;
                case 2:
                    if (top == -1) {
                        System.out.println("Stack Underflow");
                    } else {
                        top--;
                    }
                    break;
            }
            for (int i = 0; i <= top; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println("\nDo you want to modify the stack?\n1. Yes\n2. No\n");
            ch = sc.nextInt();
            if (ch == 2) {
                System.exit(0);
            }
        }
    }
}
