
public class S5P2 {
    public static void main(String[] args){
    int arr[] = {1,2,3,4,5};
    try{
        System.out.print(arr[7]);

    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.print("Invalid index");
    }
}

}