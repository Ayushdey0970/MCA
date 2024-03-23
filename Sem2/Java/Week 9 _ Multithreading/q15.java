public class q15 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "MyThread");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running with priority: " + Thread.currentThread().getPriority());
        }
    }
}
