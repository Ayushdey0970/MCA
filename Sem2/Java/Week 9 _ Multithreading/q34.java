public class q34 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "MyThread");
        thread.start();
        System.out.println("Running thread name: " + Thread.currentThread().getName());
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread is running...");
        }
    }
}
