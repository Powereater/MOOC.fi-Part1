
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       System.out.print("Type the points [0-60]: ");
         int number = Integer.parseInt(reader.nextLine());
         
         if (number <= 29){
             System.out.print("grade: failed"  );
             
         }
         else if (29 < number && number <= 34){
             System.out.print("grade: 1" );
             
         }
          else if (34 < number && number <= 39){
             System.out.print("grade: 2" );
             
         } else if (39 < number && number <= 44){
             System.out.print("grade: 3" );
             
         } else if (44 < number && number <= 49){
             System.out.print("grade: 4" );
             
         } else if (49 < number && number <= 60){
             System.out.print("grade: 5" );
             
         }
         
    }
}
