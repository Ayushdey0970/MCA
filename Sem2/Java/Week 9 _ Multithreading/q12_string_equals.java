public class q12_string_equals implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        q12_string_equals myRunnable = new q12_string_equals();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
