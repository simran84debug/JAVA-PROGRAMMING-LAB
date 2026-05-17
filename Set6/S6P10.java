// Demonstration of Different Thread Lifecycle States

class MyThread extends Thread {

    public void run() {

        System.out.println("Thread is in Running state");

        try {

            // Timed Waiting State
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread execution completed");
    }
}

public class S6P10 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();

        // NEW State
        System.out.println("State after thread creation: " + t1.getState());

        // RUNNABLE State
        t1.start();
        System.out.println("State after start(): " + t1.getState());

        try {

            // Give thread time to enter sleep state
            Thread.sleep(500);

            // TIMED_WAITING State
            System.out.println("State during sleep(): " + t1.getState());

            // Main thread waits for t1 to finish
            t1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TERMINATED State
        System.out.println("State after completion: " + t1.getState());
    }
}