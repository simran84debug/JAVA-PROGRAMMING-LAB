class MyThread extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Before sleep : " + i);

            try
            {
                Thread.sleep(1000); 
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

            System.out.println("After sleep : " + i);
        }
    }
}

public class S6P3
{
    public static void main(String args[])
    {
        MyThread t1 = new MyThread();

        System.out.println("Thread execution starts...");
        t1.start();
        System.out.println("Main thread continues...");
    }
}