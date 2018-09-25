
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you? ");
         int number = Integer.parseInt(reader.nextLine());
         
         
         if (0 <= number && number <= 120){
             System.out.print("OK" );
             
         }
         
          else {
             System.out.print("Impossible!" );
             
         }
    }
}
