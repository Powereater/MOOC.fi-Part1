
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine(); 
        int Tlength = calculateCharacters(name);
        System.out.println("Number of characters: " + Tlength);
        
// call your method from here
    }
    
    // do here the method
     public static int calculateCharacters(String text){
         int Tlength = text.length();
         return Tlength;
     }
    
}
