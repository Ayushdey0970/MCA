public class q31 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "MyThread");
        System.out.println("Thread name: " + thread.getName());
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running...");
        }
    }
}
