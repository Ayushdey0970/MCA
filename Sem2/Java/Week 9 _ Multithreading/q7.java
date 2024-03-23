import java.lang.reflect.*;

public class q7 {
    public static void main(String[] args) {
        Method[] methods = SynchronizedClass.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            if (method.isSynchronized()) {
                System.out.println("Synchronized: Yes");
            } else {
                System.out.println("Synchronized: No");
            }
        }
    }
}

class SynchronizedClass {
    public synchronized void synchronizedMethod() {
        System.out.println("Synchronized method is being executed.");
    }

    public void nonSynchronizedMethod() {
        System.out.println("Non-Synchronized method is being executed.");
    }
}
