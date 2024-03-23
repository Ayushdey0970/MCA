public class q30 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        System.out.println("Thread is alive before starting: " + thread.isAlive());
        thread.start();
        System.out.println("Thread is alive after starting: " + thread.isAlive());
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running...");
        }
    }
}
