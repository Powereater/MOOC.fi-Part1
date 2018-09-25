import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.print("Type the first number: ");
         int number = Integer.parseInt(reader.nextLine());
       
            System.out.print("Type the second number: ");
         int number2 = Integer.parseInt(reader.nextLine());
         int reminder = number % 2;
         //System.out.print( + reminder);
         if (number > number2){
             System.out.print("Greater number: " + number );
             
         }
         else if (number < number2){
             System.out.print("Greater number: " + number2 );
             
         }
         else{
             System.out.print("The numbers are equal!");
             
         }
    }
}
