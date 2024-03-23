public class q12 implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        q12 myRunnable = new q12();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
