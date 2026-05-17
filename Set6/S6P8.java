
// Deadlock Demonstration using Two Threads and Two Resources

class Thread1 extends Thread {

    private final Object resource1;
    private final Object resource2;

    Thread1(Object r1, Object r2) {
        resource1 = r1;
        resource2 = r2;
    }

    public void run() {

        synchronized (resource1) {

            System.out.println("Thread1 locked Resource 1");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread1 waiting for Resource 2");

            synchronized (resource2) {
                System.out.println("Thread1 locked Resource 2");
            }
        }
    }
}

class Thread2 extends Thread {

    private final Object resource1;
    private final Object resource2;

    Thread2(Object r1, Object r2) {
        resource1 = r1;
        resource2 = r2;
    }

    public void run() {

        synchronized (resource2) {

            System.out.println("Thread2 locked Resource 2");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread2 waiting for Resource 1");

            synchronized (resource1) {
                System.out.println("Thread2 locked Resource 1");
            }
        }
    }
}

// Main Class
public class S6P8 {

    public static void main(String[] args) {

        Object resource1 = new Object();
        Object resource2 = new Object();

        Thread1 t1 = new Thread1(resource1, resource2);
        Thread2 t2 = new Thread2(resource1, resource2);

        t1.start();
        t2.start();
    }
}