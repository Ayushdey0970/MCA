public class q17 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "MyThread");
        int priority = thread.getPriority();
        System.out.println("Thread priority before setting: " + priority);
        thread.setPriority(Thread.MAX_PRIORITY);
        int updatedPriority = thread.getPriority();
        System.out.println("Thread priority after setting: " + updatedPriority);
    }
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running with priority: " + Thread.currentThread().getPriority());
        }
    }
}
