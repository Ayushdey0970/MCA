public class q14 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "MyThread");
        int priority = thread.getPriority();
        System.out.println("Thread priority: " + priority);
    }
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running...");
        }
    }
}
