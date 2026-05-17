class Buffer {
    private int data;
    private boolean available = false;

    // Producer method
    synchronized void produce(int value) {
        try {
            // Wait if buffer is full
            while (available) {
                wait();
            }

            data = value;
            System.out.println("Produced: " + data);

            available = true;

            // Notify consumer
            notify();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Consumer method
    synchronized void consume() {
        try {
            // Wait if buffer is empty
            while (!available) {
                wait();
            }

            System.out.println("Consumed: " + data);

            available = false;

            // Notify producer
            notify();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Producer Thread
class Producer extends Thread {
    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer Thread
class Consumer extends Thread {
    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main Class
public class S6P7 {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}