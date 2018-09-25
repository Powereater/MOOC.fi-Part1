
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int number1 = Integer.parseInt(reader.nextLine());
        int number = 0;
        while (number < number1){
           number++;
           System.out.print(number + "\n");
       }
        
        // Write your code here
        
    }
}
