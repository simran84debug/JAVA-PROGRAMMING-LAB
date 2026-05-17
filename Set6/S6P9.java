// Demonstration of Daemon Thread in Java

class MyDaemon extends Thread {

    public void run() {

        while (true) {

            System.out.println("Daemon thread is running...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class S6P9 {

    public static void main(String[] args) {

        MyDaemon d = new MyDaemon();

        // Set thread as daemon
        d.setDaemon(true);

        d.start();

        // Main thread execution
        for (int i = 1; i <= 5; i++) {

            System.out.println("Main thread is working...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main thread finished.");
    }
}