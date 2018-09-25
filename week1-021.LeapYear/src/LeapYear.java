
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
         int number = Integer.parseInt(reader.nextLine());
         int reminder4 = number % 4;
         int reminder100 = number % 100;
         int reminder400 = number % 400;
         
         
         if (0 == reminder400){
             System.out.print("The year is a leap year." );
             
         }
         
          else if ( reminder4 == 0 && reminder100 != 0) {
             System.out.print("The year is a leap year." );
             
         }
          else {
              System.out.print("The year is not a leap year." );
          }

    }
}
