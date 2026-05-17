class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);

            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class S6P2
{
    public static void main(String args[])
    {
        MyRunnable obj = new MyRunnable();

        Thread t1 = new Thread(obj);
        t1.start();

        // Main thread running concurrently
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Main Thread : " + i);

            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}