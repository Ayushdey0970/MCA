public class q4_Block_Level_Synchronization {
    private static int counter = 0;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count: " + counter);
    }

    static class MyRunnable implements Runnable {
        public void run() {
            for (int i = 0; i < 1000; i++) {
                incrementCounter();
            }
        }

        private void incrementCounter() {
            synchronized (lock) {
                counter++;
            }
        }
    }
}
