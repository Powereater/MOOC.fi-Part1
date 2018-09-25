
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.print("In the beginning there were the swamp, the hoe and Java. \n");
    }

    public static void main(String[] args) {
        
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in);
        System.out.print("How many? \n");
        int number = Integer.parseInt(reader.nextLine());
        int counter = 0;
        while (counter < number){
            printText();
            counter++;
                    
        }
        
    }
}
