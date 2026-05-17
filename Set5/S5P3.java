import java.util.Scanner;
public class S5P3 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    try{
        System.out.print("Enetr String: ");
        String str= sc.nextLine();
        int a= Integer.parseInt(str);
    }
    catch(NumberFormatException e){
    System.out.print("Invalid input");}
}
}
