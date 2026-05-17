import java.util.Scanner;
public class S5P4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        try{
            System.out.print("Enetr String1: ");
        String str1= sc.nextLine();
        System.out.print("Enetr String2: ");
        String str2= sc.nextLine();
        int a=Integer.parseInt(str1);
        int b=Integer.parseInt(str2);

        int res= a/b;
        System.out.print("Division result: "+res);
    }
    catch(ArithmeticException e){
           System.out.println("Denominstor cannot be 0");

        }
        catch(NumberFormatException e){
    System.out.print("Invalid input");}
        sc.close();
}
}

