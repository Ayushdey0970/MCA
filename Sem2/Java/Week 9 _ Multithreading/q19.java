public class q19 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        q19 thread = new q19();
        thread.start();
    }
}
