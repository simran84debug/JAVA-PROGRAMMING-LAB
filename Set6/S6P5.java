class MyThread extends Thread
{
    MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(
                getName() + 
                " Priority = " + getPriority() + 
                " Count = " + i
            );

            try
            {
                Thread.sleep(800);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

public class S6P5
{
    public static void main(String args[])
    {
        MyThread t1 = new MyThread("Minimum Priority Thread");
        MyThread t2 = new MyThread("Normal Priority Thread");
        MyThread t3 = new MyThread("Maximum Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY); 
        t2.setPriority(Thread.NORM_PRIORITY); 
        t3.setPriority(Thread.MAX_PRIORITY); 

        t1.start();
        t2.start();
        t3.start();
    }
}