import java.util.*;

class q3_queue_with_array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = sc.nextInt();
        int ar[] = new int[n];
        int front = -1, rear = -1;
        while (true) {
            System.out.println("1. Enqueue\n2. Dequeue\n");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Value to Enter: ");
                    int val = sc.nextInt();
                    if (front == -1) {
                        front = rear = 0;
                        ar[front] = val;
                    } else if (rear == n - 1) {
                        System.out.println("Queue Overflow");
                    } else {
                        rear++;
                        ar[rear] = val;
                    }
                    break;
                case 2:
                    if (front > rear) {
                        System.out.println("Stack Underflow");
                    } else {
                        front++;
                    }
                    break;
            }
            for (int i = front; i <= rear; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println("\nDo you want to modify the queue?\n1. Yes\n2. No\n");
            ch = sc.nextInt();
            if (ch == 2) {
                System.exit(0);
            }
        }
    }
}
