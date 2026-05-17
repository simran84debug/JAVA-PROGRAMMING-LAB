
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class S5P5
   public S5P5() {
   }

   public void main(String[] var1) {
      BufferedReader var2 = null;

      try {
         var2 = new BufferedReader(new FileReader("data.txt"));

         String var3;
         while((var3 = var2.readLine()) != null) {
            System.out.println(var3);
         }
      } catch (FileNotFoundException var14) {
         System.out.print("File not found");
      } catch (IOException var15) {
         System.out.print("Error reading file");
      } finally {
         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (IOException var13) {
            System.out.print("Error closing file");
         }

      }

   }
