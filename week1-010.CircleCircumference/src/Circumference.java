
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {            
        Scanner reader = new Scanner(System.in);
        System.out.print("type in radius: ");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.print("Circumference of the circle: " + (1.0 * number * Math.PI * 2));
        // Program your solution here 
    }
}
