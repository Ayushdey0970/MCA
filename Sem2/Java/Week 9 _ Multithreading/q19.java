public class q19 extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        q19_replace_substring thread = new q19_replace_substring();
        thread.start();
    }
}
