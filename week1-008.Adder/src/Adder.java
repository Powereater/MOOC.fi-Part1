
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("type another number: ");
        int an_number = Integer.parseInt(reader.nextLine());
        System.out.print("sum of the numbers: " + (number + an_number));
        // Implement your program here. Remember to ask the input from user
    }
}
