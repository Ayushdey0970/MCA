public class q23 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.setName("MyThread");
        thread.start();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }
    }
}
