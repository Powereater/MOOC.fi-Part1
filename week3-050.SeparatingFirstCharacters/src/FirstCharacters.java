import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();  
        if (name.length() >= 3) {
           System.out.println("1. character: " + name.charAt(0) + "\n"
                   + "2. character: " + name.charAt(1) + "\n"
                           + "3. character: " + name.charAt(2)); 
        }
    }
}
