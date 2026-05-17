class MyThread extends Thread{
    public void run(){
        for(int i =1;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try{
                Thread.sleep(88);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class S6P1 {
    public static void main(String args[]){
        MyThread t1=new MyThread();
        t1.start();
        for(int i=1;i<=5;i++){
            System.out.println("Main thread: "+i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

}
