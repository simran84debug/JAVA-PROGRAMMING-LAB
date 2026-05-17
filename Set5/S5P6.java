import java.util.Scanner;
public class S5P6{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a: " );
        int a=sc.nextInt();
        System.out.print("Enter b: " );
        int b=sc.nextInt();
        try{
            int res =a/b;
            System.out.println("Result: "+res);
        }
        catch(ArithmeticException e){
           System.out.println("Denominstor cannot be 0");

        }
       
        finally{
            System.out.println("This is will always execute");
        } sc.close();
    }
}
