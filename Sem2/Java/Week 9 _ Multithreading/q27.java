public class q27 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread is running...");
        }
    }
}
