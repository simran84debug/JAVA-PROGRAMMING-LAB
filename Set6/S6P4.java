class MyThread extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Child Thread : " + i);

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

public class S6P4
{
    public static void main(String args[])
    {
        MyThread t1 = new MyThread();

        t1.start();

        try
        {
            t1.join(); 
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("Main thread resumes execution.");
    }
}
