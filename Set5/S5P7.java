
public class S5P7 {
   

    public static void checkAge(int age){
        if(age < 18){   throw new IllegalArgumentException("Not eligible");
        }
        else{
            System.out.print("Eligible");
        }
    }
    
    public static void main(String[] args) {
        try {
            checkAge(15);
        }
         catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
    }
    
    
}