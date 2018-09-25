
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        
        //System.out.print("Type a number: ");
        int numb = 101;
        int counter = 0;
        while (numb != numberDrawn) {
           System.out.print("Guess a number: ");
            numb = Integer.parseInt(reader.nextLine()); 
            counter++;
            if (numb > numberDrawn) {
                System.out.print("The number is lesser, guesses made: " + counter );
            }
            if (numb < numberDrawn) {
                System.out.print("The number is greater, guesses made: " + counter);
                
            }
            
            
        }
        
                System.out.print("Congratulations, your guess is correct!");
            
        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
